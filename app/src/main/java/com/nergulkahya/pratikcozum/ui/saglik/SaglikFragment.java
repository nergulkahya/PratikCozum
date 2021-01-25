package com.nergulkahya.pratikcozum.ui.saglik;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nergulkahya.pratikcozum.R;
import com.nergulkahya.pratikcozum.ui.slideshow.SlideshowViewModel;

public class SaglikFragment extends Fragment {

    private SaglikViewModel saglikViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        saglikViewModel =
                ViewModelProviders.of(this).get(SaglikViewModel.class);
        View root = inflater.inflate(R.layout.saglik_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_saglik);
        saglikViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
