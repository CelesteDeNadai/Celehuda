package com.example.tmp_sda_1176.hudacele;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AccountChildActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;
    List<PurchaseDetails> purchases = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_child_layout);

        //purchases = new ArrayList<Purchase_Details>();
        initialiseData();


        //Create recycler view
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // create an adapter and supply the data to be displayed
        adapter = new PurchaseAdapter(this, purchases);
        //Connect the adapter with RecyclerView
        mRecyclerView.setAdapter(adapter);
        //Give the recycler view a default layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // Method of Initiating Data in the list, to be called for the RecyclerView
    public void initialiseData(){

        purchases.add(new PurchaseDetails("1/1/2018", "ICA", 30.5));
        purchases.add(new PurchaseDetails("1/2/2018", "MAXI", 20.5));
        purchases.add(new PurchaseDetails("1/1/2018", "ICA", 30.5));
        purchases.add(new PurchaseDetails("1/2/2018", "MAXI", 20.5));
        purchases.add(new PurchaseDetails("1/1/2018", "ICA", 30.5));
        purchases.add(new PurchaseDetails("1/2/2018", "MAXI", 20.5));
        purchases.add(new PurchaseDetails("1/1/2018", "ICA", 30.5));
        purchases.add(new PurchaseDetails("1/2/2018", "MAXI", 20.5));
        purchases.add(new PurchaseDetails("1/1/2018", "ICA", 30.5));
        purchases.add(new PurchaseDetails("1/2/2018", "MAXI", 20.5));




    }
}

