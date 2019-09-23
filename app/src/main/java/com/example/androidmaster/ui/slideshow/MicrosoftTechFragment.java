package com.example.androidmaster.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.androidmaster.R;

public class MicrosoftTechFragment extends Fragment {

    private MicrosoftTechViewModel microsoftTechViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        microsoftTechViewModel =
                ViewModelProviders.of(this).get(MicrosoftTechViewModel.class);
        View root = inflater.inflate(R.layout.fragment_microsoft_tech, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
        microsoftTechViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });
        return root;
    }
}