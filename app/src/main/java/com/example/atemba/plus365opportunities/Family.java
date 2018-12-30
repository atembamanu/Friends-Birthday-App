package com.example.atemba.plus365opportunities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Family extends AppCompatActivity {
GridView gridv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        gridv=(GridView) findViewById(R.id.gridview);
    }
}
