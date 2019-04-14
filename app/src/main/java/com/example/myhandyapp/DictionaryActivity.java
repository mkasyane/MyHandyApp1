package com.example.myhandyapp;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.myhandyapp.listitems.Flight;

import java.util.List;

public class DictionaryActivity extends CommonActivity {

    ProgressBar progressBar;
    private List<Flight> flightList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_activity);


    }


}