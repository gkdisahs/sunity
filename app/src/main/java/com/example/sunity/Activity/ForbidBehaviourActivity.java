package com.example.sunity.Activity;

import android.os.Bundle;

import com.example.sunity.R;

public class ForbidBehaviourActivity extends BasicActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forbid_behaviour);
        setToolbarTitle("금지행위 안내");
    }
}
