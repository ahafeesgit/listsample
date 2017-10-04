package com.example.android.myapplication.adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.android.myapplication.R;
import com.example.android.myapplication.model.LoggedInModel;

import java.util.ArrayList;


public class SimpleListAdapter extends RecyclerView.Adapter<SimpleListAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<LoggedInModel> mList;
    private final LayoutInflater inflater;

    public SimpleListAdapter(Context context, ArrayList<LoggedInModel> mList) {
        this.context = context;
        this.mList = mList;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(inflater.inflate(R.layout.frame_simple_list, parent, false));
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        LoggedInModel mData = mList.get(position);
        holder.mTvName.setText(mData.getName());
        holder.mTvDesignation.setText(mData.getDesignation());
        holder.mTvTime.setText(mData.getLogTime());



    }



    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvName;
        private TextView mTvDesignation;
        private TextView mTvTime;

        private MyViewHolder(View itemView) {
            super(itemView);
            this.mTvName = (TextView) itemView.findViewById(R.id.tv_name);
            this.mTvDesignation = (TextView) itemView.findViewById(R.id.tv_designation);
            this.mTvTime = (TextView) itemView.findViewById(R.id.tv_checked_in);


        }


    }


}
