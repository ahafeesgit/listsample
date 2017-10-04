package com.example.android.myapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.myapplication.R;
import com.example.android.myapplication.adapter.SimpleListAdapter;
import com.example.android.myapplication.model.LoggedInModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRvList;
    private SimpleListAdapter mAdapter;
    private ArrayList<LoggedInModel> mlistArray = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }
    private  void initialize()
    {
        mRvList = (RecyclerView) findViewById(R.id.rv_list);
        for(int i= 1;i <= 10; i++){
            LoggedInModel model = new LoggedInModel();
            model.setName("Name"+i);
            model.setDesignation("Designation"+i);
            model.setLogTime("Time"+i);
            mlistArray.add(model);
        }
        mAdapter = new SimpleListAdapter(getApplicationContext(),mlistArray);
        mRvList.setLayoutManager( new LinearLayoutManager(getApplicationContext()));
        mRvList.setAdapter(mAdapter);
    }
}
