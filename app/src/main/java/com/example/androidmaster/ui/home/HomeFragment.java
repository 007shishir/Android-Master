package com.example.androidmaster.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.example.androidmaster.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;
    private LinearLayout mLL_android_studio, mLL_java, mLL_kotlin, mLL_mvvm, mLL_restApi;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        mLL_android_studio = root.findViewById(R.id.mLL_android_studio);
        mLL_java = root.findViewById(R.id.mLL_java);
        mLL_kotlin = root.findViewById(R.id.mLL_kotlin);
        mLL_mvvm = root.findViewById(R.id.mLL_mvvm);
        mLL_restApi = root.findViewById(R.id.mLL_restApi);

        mLL_android_studio.setOnClickListener(this);
        mLL_java.setOnClickListener(this);
        mLL_kotlin.setOnClickListener(this);
        mLL_mvvm.setOnClickListener(this);
        mLL_restApi.setOnClickListener(this);

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.mLL_android_studio:
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_android_Tutorial);
                break;
            case R.id.mLL_java:
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_java_tutorial);
                break;
            case R.id.mLL_kotlin:
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_kotlin_tutorial);
                break;
            case R.id.mLL_mvvm:
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_mvvm_tutorial);
                break;
            case R.id.mLL_restApi:
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_rest_api_tutorial);
                break;
            default:
                Toast.makeText(getContext(), "this is default", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}