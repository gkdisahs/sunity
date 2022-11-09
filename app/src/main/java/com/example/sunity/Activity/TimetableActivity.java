package com.example.sunity.Activity;

import android.os.Bundle;

import com.example.sunity.R;

public class TimetableActivity extends BasicActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        setToolbarTitle("시간표");
    }
}