package com.example.androidmaster.webDev_tutorial_fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.androidmaster.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CSS_Tutorial extends Fragment implements View.OnClickListener {

    private TextView mTxt_and_mem_p01, mTxt_and_mem_p02, mTxt_and_mem_p03, mTxt_and_mem_p04,
            mTxt_and_mcq_p01, mTxt_and_mcq_p02, mTxt_and_mcq_p03, mTxt_and_mcq_p04;
    View rootView;

    public CSS_Tutorial() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_android__tutorial, container, false);
        mTxt_and_mem_p01 = rootView.findViewById(R.id.mTxt_and_mem_p01);
        mTxt_and_mem_p02 = rootView.findViewById(R.id.mTxt_and_mem_p02);
        mTxt_and_mem_p03 = rootView.findViewById(R.id.mTxt_and_mem_p03);
        mTxt_and_mem_p04 = rootView.findViewById(R.id.mTxt_and_mem_p04);

        mTxt_and_mcq_p01 = rootView.findViewById(R.id.mTxt_and_mcq_p01);
        mTxt_and_mcq_p02 = rootView.findViewById(R.id.mTxt_and_mcq_p02);
        mTxt_and_mcq_p03 = rootView.findViewById(R.id.mTxt_and_mcq_p03);
        mTxt_and_mcq_p04 = rootView.findViewById(R.id.mTxt_and_mcq_p04);

        mTxt_and_mem_p01.setOnClickListener(this);
        mTxt_and_mem_p02.setOnClickListener(this);
        mTxt_and_mem_p03.setOnClickListener(this);
        mTxt_and_mem_p04.setOnClickListener(this);

        mTxt_and_mcq_p01.setOnClickListener(this);
        mTxt_and_mcq_p02.setOnClickListener(this);
        mTxt_and_mcq_p03.setOnClickListener(this);
        mTxt_and_mcq_p04.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mTxt_and_mem_p01:
                Navigation.findNavController(v).navigate(R.id.action_css_tutorial_to_memorise_recV);
                break;
            case R.id.mTxt_and_mem_p02:
                Navigation.findNavController(v).navigate(R.id.action_css_tutorial_to_memorise_recV_p2);
                break;
            case R.id.mTxt_and_mem_p03:
                printingToastMessage();
                break;
            case R.id.mTxt_and_mem_p04:
                printingToastMessage();
                break;
            case R.id.mTxt_and_mcq_p01:
                printingToastMessage();
                break;
            case R.id.mTxt_and_mcq_p02:
                printingToastMessage();
                break;
            case R.id.mTxt_and_mcq_p03:
                printingToastMessage();
                break;
            case R.id.mTxt_and_mcq_p04:
                printingToastMessage();
                break;

            default:
                Toast.makeText(getContext(), "This is default", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void printingToastMessage() {
        Toast.makeText(getContext(), "This section is under development", Toast.LENGTH_SHORT).show();
    }
}
