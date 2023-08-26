package ru.kuz.calendr.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import ru.kuz.calendr.R;
import ru.kuz.calendr.databinding.ActivityMainBinding;
import ru.kuz.calendr.databinding.AddActivityBinding;

public class AddActivity extends AppCompatActivity {
    AddActivityBinding binding;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        binding = AddActivityBinding.inflate(getLayoutInflater());
        Glide.with(getApplicationContext()).load("https://memepedia.ru/wp-content/uploads/2020/06/barri-vud-mem-2.jpg").into(binding.addmemozavr);

        adjustClickListener();

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }

    public void adjustClickListener() {
        binding.addchelka.setNavigationOnClickListener(view -> onBackPressed());

        binding.addUrlInput.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide
                        .with(getApplicationContext())
                        .load(binding.imageUrl.getText().toString()) //ссылка на изображение
                        .placeholder(R.drawable.baseline_home_24) //пока грузится картинка показать:
                        .into(binding.addmemozavr); //куда кидать изображение
            }
        });
    }
}
