package com.example.androidmaster.ui.tools;


import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.androidmaster.MainActivity;
import com.example.androidmaster.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class EK_mcq_memorise_option extends Fragment implements View.OnClickListener {

    private TextView mTxt_and_mem_p01, mTxt_and_mem_p02, mTxt_and_mem_p03, mTxt_and_mem_p04,
            mTxt_and_mcq_p01, mTxt_and_mcq_p02, mTxt_and_mcq_p03, mTxt_and_mcq_p04, mTxt_topic_name;
    View rootView;
    private String topic_name, topic_code;
    private Toolbar toolbar;

    public EK_mcq_memorise_option() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_android__tutorial, container, false);

        mTxt_topic_name = rootView.findViewById(R.id.mTxt_topic_name);
        topic_name = getArguments().getString("topic_name");
        topic_code = getArguments().getString("topic_code");
        Toast.makeText(getContext(), topic_name +" and "+ topic_code, Toast.LENGTH_LONG).show();
        mTxt_topic_name.setText(topic_name);

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
                printingToastMessage();
//                Bundle memorise_p01 = new Bundle();
//                memorise_p01.putString("child_name", "adv_excel_mem_p01");
//                Navigation.findNavController(v).navigate(R.id.action_advanced_excel_tutorial_to_memorise_recV, memorise_p01);
                break;
            case R.id.mTxt_and_mem_p02:
                printingToastMessage();
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
