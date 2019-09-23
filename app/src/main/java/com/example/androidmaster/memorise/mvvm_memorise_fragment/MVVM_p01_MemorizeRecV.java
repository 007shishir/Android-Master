package com.example.androidmaster.memorise.mvvm_memorise_fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidmaster.Parameter;
import com.example.androidmaster.R;
import com.example.androidmaster.memorise.MemorizeVersion1;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class MVVM_p01_MemorizeRecV extends Fragment {

//    private RecyclerView mRecycler_Memorize;
    private RecyclerView mRecycler_Memorize;
    private DatabaseReference mDatabase;

    View rootView;
    public MVVM_p01_MemorizeRecV() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_memorize_rec_v, container, false);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("mvvm_mem_p01");
        mDatabase.keepSynced(false);
        mRecycler_Memorize = rootView.findViewById(R.id.mRecycler_Memorize);
        mRecycler_Memorize.setHasFixedSize(true);
        mRecycler_Memorize.setLayoutManager(new LinearLayoutManager(getContext()));
        return rootView;
    }


    @Override
    public void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Parameter, ParameterViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<Parameter, ParameterViewHolder>
                        (Parameter.class, R.layout.recyclerview_for_memorise_mcq, ParameterViewHolder.class, mDatabase) {
                    @Override
                    protected void populateViewHolder(ParameterViewHolder viewHolder, Parameter model, int position) {
                        final String post_key = getRef(position).getKey();
                        viewHolder.setSource(model.getSource());
                        viewHolder.setTopic(model.getTopic());
                        viewHolder.setSum(model.getSum());
                        viewHolder.setTotal(model.getTotal());
                        viewHolder.mView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getActivity(), MemorizeVersion1.class);
                                intent.putExtra("key_name", post_key);
                                intent.putExtra("childName", "mvvm_mem_p01");
                                Toast.makeText(getContext(), "Please make sure you turn off the rotation of your device", Toast.LENGTH_LONG).show();
                                startActivity(intent);
                            }
                        });

                    }
                };
        mRecycler_Memorize.setAdapter(firebaseRecyclerAdapter);
    }

    public static class ParameterViewHolder extends RecyclerView.ViewHolder
    {
        View mView;
        public ParameterViewHolder(View itemView)
        {
            super(itemView);
            mView = itemView;
        }
        public void setSource(String source)
        {
            TextView post_source = mView.findViewById(R.id.mTxt_source);
            post_source.setText(source);
        }
        public void setTopic(String topic)
        {
            TextView post_topic = mView.findViewById(R.id.mTxt_topic);
            post_topic.setText(topic);
        }
        public void setSum(String sum)
        {
            TextView post_sum = mView.findViewById(R.id.mTxt_sum);
            post_sum.setText(sum);
        }
        public void setTotal(String total)
        {
            TextView post_total = mView.findViewById(R.id.mTxt_total);
            post_total.setText(total);
        }
    }
}
