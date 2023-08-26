package ru.kuz.calendr.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import ru.kuz.calendr.adapters.ScrollAdapter;
import ru.kuz.calendr.databinding.HomeFragmentBinding;

public class HomeFragment extends Fragment {

    HomeFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = HomeFragmentBinding.inflate(LayoutInflater.from(getContext()), container, false);
        binding.recycler.setAdapter(new ScrollAdapter(getContext()));

        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }
}

