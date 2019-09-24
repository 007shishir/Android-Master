package com.example.androidmaster.ui.slideshow;

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

public class MicrosoftTechFragment extends Fragment implements View.OnClickListener {

    private MicrosoftTechViewModel microsoftTechViewModel;
    private LinearLayout mLL_excel_2010, mLL_word_2010, mLL_advanced_excel, mLL_advanced_excel_charts,
            mLL_excel_pivot_table, mLL_excel_function;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        microsoftTechViewModel =
                ViewModelProviders.of(this).get(MicrosoftTechViewModel.class);
        View root = inflater.inflate(R.layout.fragment_microsoft_tech, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
        mLL_excel_2010 = root.findViewById(R.id.mLL_excel_2010);
        mLL_word_2010 = root.findViewById(R.id.mLL_word_2010);
        mLL_advanced_excel = root.findViewById(R.id.mLL_advanced_excel);
        mLL_advanced_excel_charts = root.findViewById(R.id.mLL_advanced_excel_charts);
        mLL_excel_pivot_table = root.findViewById(R.id.mLL_excel_pivot_table);
        mLL_excel_function = root.findViewById(R.id.mLL_excel_function);

        mLL_excel_2010.setOnClickListener(this);
        mLL_word_2010.setOnClickListener(this);
        mLL_advanced_excel.setOnClickListener(this);
        mLL_advanced_excel_charts.setOnClickListener(this);
        mLL_excel_pivot_table.setOnClickListener(this);
        mLL_excel_function.setOnClickListener(this);

        microsoftTechViewModel.getText().observe(this, new Observer<String>() {
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
            case R.id.mLL_excel_2010:
                Navigation.findNavController(v).navigate(R.id.action_nav_microsoft_tech_to_excel_2010_tutorial);
                break;
            case R.id.mLL_word_2010:
                Navigation.findNavController(v).navigate(R.id.action_nav_microsoft_tech_to_word_2010_tutorial);
                break;
            case R.id.mLL_advanced_excel:
                Navigation.findNavController(v).navigate(R.id.action_nav_microsoft_tech_to_advanced_excel_tutorial);
                break;
            case R.id.mLL_advanced_excel_charts:
                Navigation.findNavController(v).navigate(R.id.action_nav_microsoft_tech_to_excel_charts_tutorial);
                break;
            case R.id.mLL_excel_pivot_table:
                Navigation.findNavController(v).navigate(R.id.action_nav_microsoft_tech_to_excel_pivot_tutorial);
                break;
            case R.id.mLL_excel_function:
                Navigation.findNavController(v).navigate(R.id.action_nav_microsoft_tech_to_excel_func_tutorial);
                break;
            default:
                getToastMessage();
                break;
        }
    }

    public void getToastMessage() {
        Toast.makeText(getContext(), "This section is under development", Toast.LENGTH_SHORT).show();
    }
}