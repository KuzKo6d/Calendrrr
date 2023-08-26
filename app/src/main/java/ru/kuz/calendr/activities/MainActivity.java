package ru.kuz.calendr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import ru.kuz.calendr.R;
import ru.kuz.calendr.databinding.ActivityMainBinding;
import ru.kuz.calendr.fragments.HistoryFragment;
import ru.kuz.calendr.fragments.HomeFragment;
import ru.kuz.calendr.fragments.SearchFragment;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    HomeFragment homeFragment = new HomeFragment();
    SearchFragment searchFragment = new SearchFragment();
    HistoryFragment historyFragment = new HistoryFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        getSupportFragmentManager().beginTransaction().
                replace(binding.fragment.getId(), homeFragment)
                .commit();


        adjustClickListener();

        setContentView(binding.getRoot());
    }

    private void adjustClickListener() {
        binding.nav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.homePage) {
                getSupportFragmentManager().beginTransaction()
                        .replace(binding.fragment.getId(), homeFragment)
                        .commit();
                return true;
            } else if (id == R.id.searchPage) {
                getSupportFragmentManager().beginTransaction().
                        replace(binding.fragment.getId(), searchFragment)
                        .commit();
                return true;
            } else {
                getSupportFragmentManager().beginTransaction().
                        replace(binding.fragment.getId(), historyFragment)
                        .commit();
                return true;
            }
        });

        binding.fab1.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), AddActivity.class);
            startActivity(intent);
        });
    }

    ;

}