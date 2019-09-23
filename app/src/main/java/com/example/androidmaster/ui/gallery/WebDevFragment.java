package com.example.androidmaster.ui.gallery;

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

public class WebDevFragment extends Fragment implements View.OnClickListener {

    private WebDevViewModel webDevViewModel;
    private LinearLayout mLL_html, mLL_css, mLL_wordPress, mLL_googleAnalytics;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        webDevViewModel =
                ViewModelProviders.of(this).get(WebDevViewModel.class);
        View root = inflater.inflate(R.layout.fragment_web_dev, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
        mLL_html = root.findViewById(R.id.mLL_html);
        mLL_css = root.findViewById(R.id.mLL_css);
        mLL_wordPress = root.findViewById(R.id.mLL_wordPress);
        mLL_googleAnalytics = root.findViewById(R.id.mLL_googleAnalytics);

        mLL_html.setOnClickListener(this);
        mLL_css.setOnClickListener(this);
        mLL_wordPress.setOnClickListener(this);
        mLL_googleAnalytics.setOnClickListener(this);

        webDevViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mLL_html:
                Navigation.findNavController(v).navigate(R.id.action_nav_web_development_to_html_tutorial);
                break;
            case R.id.mLL_css:
                Navigation.findNavController(v).navigate(R.id.action_nav_web_development_to_css_tutorial);
                break;
            case R.id.mLL_wordPress:
                Navigation.findNavController(v).navigate(R.id.action_nav_web_development_to_wordPress_tutorial);
                break;
            case R.id.mLL_googleAnalytics:
                Navigation.findNavController(v).navigate(R.id.action_nav_web_development_to_google_analytics_tutorial);
                break;
            default:
                showingToastMessage();
                break;
        }
    }

    public void showingToastMessage() {
        Toast.makeText(getContext(), "This section is under development", Toast.LENGTH_SHORT).show();
    }
}