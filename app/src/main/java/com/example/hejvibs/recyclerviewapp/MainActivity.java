package com.example.hejvibs.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        // Created a data source i.e. String ArrayList
        String[] languages = {"Java", "Kotlin", "Swift", "Python", "C#", "JavaScript", "JSON", "SQLite", "XML", "Java", "Kotlin", "Swift", "Python", "C#", "JavaScript", "JSON", "SQLite", "XML"};
        programmingList.setAdapter(new ProgrammingAdapter(languages));
    }
}
