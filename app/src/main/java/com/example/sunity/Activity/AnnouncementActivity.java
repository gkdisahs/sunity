package com.example.sunity.Activity;

import android.os.Bundle;

import com.example.sunity.R;

public class AnnouncementActivity extends BasicActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement);
        setToolbarTitle("공지사항");
    }
}
