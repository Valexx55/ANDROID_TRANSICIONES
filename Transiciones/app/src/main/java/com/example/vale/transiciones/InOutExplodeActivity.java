package com.example.vale.transiciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;

public class InOutExplodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_out_explode);
        /*si elimino los elementos
        <item name="android:windowEnterTransition">@transition/slide</item>
        <item name="android:windowExitTransition">@transition/fade</item>
         en styles, tengo ocasión de personalizar la transición en cada actividad*/
        //getWindow().setEnterTransition(new Fade());// o con setExitTransition en la actividad que lanza ésta  
    }


}
