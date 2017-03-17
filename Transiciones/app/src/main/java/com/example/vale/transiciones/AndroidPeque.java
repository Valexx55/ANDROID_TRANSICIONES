package com.example.vale.transiciones;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AndroidPeque extends AppCompatActivity {

    private ImageView iv;
    private ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_peque);

        iv = (ImageView)findViewById(R.id.miimagenp);
        iv2 = (ImageView)findViewById(R.id.miimageng);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AndroidPeque.this, AndroidGrande.class);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                {
                    ActivityOptions options = ActivityOptions
                            .makeSceneTransitionAnimation(AndroidPeque.this, iv, "roboto");
                    // start the new activity
                    startActivity(intent, options.toBundle());

                } else {

                    startActivity(intent);
                }


            }
        });
    }
}
