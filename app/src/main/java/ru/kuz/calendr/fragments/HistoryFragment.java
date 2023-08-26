package ru.kuz.calendr.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ru.kuz.calendr.databinding.HistoryFragmentBinding;
import ru.kuz.calendr.databinding.HomeFragmentBinding;

public class HistoryFragment extends Fragment {
    HistoryFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = HistoryFragmentBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }
}
