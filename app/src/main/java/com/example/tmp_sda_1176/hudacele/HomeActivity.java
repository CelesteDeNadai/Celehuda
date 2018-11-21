package com.example.tmp_sda_1176.hudacele;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

private RecyclerView mRecyclerView;
private RecyclerView.Adapter adapter;
        List<ChildDetails> children = new ArrayList<>();


@Override
protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //purchases = new ArrayList<Purchase_Details>();
        initialiseData();


        //Create recycler view
        mRecyclerView = (RecyclerView) findViewById(R.id.childrenList);
        // create an adapter and supply the data to be displayed
        adapter = new ChildAdapter(this, children);
        //Connect the adapter with RecyclerView
        mRecyclerView.setAdapter(adapter);
        //Give the recycler view a default layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

        // Method of Initiating Data in the list, to be called for the RecyclerView
        public void initialiseData(){

        children.add(new ChildDetails("Gloria", "2500 Kr", 0));
        children.add(new ChildDetails("Adam", "1000 Kr", 1));
                children.add(new ChildDetails("Gloria", "2500 Kr", 0));
                children.add(new ChildDetails("Adam", "1000 Kr", 1));
                children.add(new ChildDetails("Gloria", "2500 Kr", 0));
                children.add(new ChildDetails("Adam", "1000 Kr", 1));
                children.add(new ChildDetails("Gloria", "2500 Kr", 0));
                children.add(new ChildDetails("Adam", "1000 Kr", 1));
                children.add(new ChildDetails("Gloria", "2500 Kr", 0));
                children.add(new ChildDetails("Adam", "1000 Kr", 1));

        }
}

