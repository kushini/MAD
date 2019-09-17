package com.mad.mad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lectr);
        getSupportActionBar().hide();

    }
}