package com.example.vale.transiciones;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;

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

        //prueba a sobreescribir el comportamiento
        //NO SE PUEDE SOBREESCRIBIR -- EL XML PREVALECE SOBRE EL CÓDIGO
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            Transition slidet = TransitionInflater.from(this)
                    .inflateTransition(R.transition.slide); --INFLANDO TRANSACCIÓN--
            getWindow().setExitTransition(slidet);
        }*/

    }


}
