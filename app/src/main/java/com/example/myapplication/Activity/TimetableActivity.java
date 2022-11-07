package com.example.myapplication.Activity;

import android.os.Bundle;

import com.example.myapplication.R;

public class TimetableActivity extends BasicActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        setToolbarTitle("시간표");
    }
}