package com.example.vale.transiciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AndroidGrande extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_grande);
    }

    @Override
    public void onBackPressed() {
        finishAfterTransition();
    }
}
