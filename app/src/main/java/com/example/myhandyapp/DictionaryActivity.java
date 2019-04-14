package com.example.myhandyapp;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ProgressBar;

import com.example.myhandyapp.listitems.Dictionary;
import com.example.myhandyapp.sql.DictionaryDataSource;

import java.util.List;

public class DictionaryActivity extends CommonActivity {

    ProgressBar progressBar;
    private List<Dictionary> DictionarytList;
    protected ListAdapter adt;
    private DictionaryDataSource datasource;
    private  int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_activity);


    }


}