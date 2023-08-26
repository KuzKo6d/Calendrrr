package ru.kuz.calendr.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ru.kuz.calendr.databinding.SearchFragmentBinding;

public class SearchFragment extends Fragment {
    SearchFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = SearchFragmentBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }
}
