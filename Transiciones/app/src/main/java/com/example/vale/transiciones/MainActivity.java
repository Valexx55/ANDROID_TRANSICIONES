package com.example.vale.transiciones;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, AndroidPeque.class);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Efecto Ocultar");
        menu.add("Efecto Mostrar");
        menu.add("Explode");

        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getTitle().equals("Efecto Ocultar"))
        {
            final View myView = findViewById(R.id.imagen);
            int cx = (myView.getLeft() + myView.getRight()) / 2;
            int cy = (myView.getTop() + myView.getBottom()) / 2;
            int initialRadius = myView.getWidth();
            Animator anim = ViewAnimationUtils.createCircularReveal(myView, cx, cy, initialRadius, 0);
            anim.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    myView.setVisibility(View.INVISIBLE);
                }
            });

            anim.start();

        } else if (item.getTitle().equals("Efecto Mostrar")) {

            View myView = findViewById(R.id.imagen);
            int cx = (myView.getLeft() + myView.getRight()) / 2;
            int cy = (myView.getTop() + myView.getBottom()) / 2;
            int finalRadius = Math.max(myView.getWidth(), myView.getHeight());
            Animator anim = ViewAnimationUtils.createCircularReveal(myView, cx, cy, 0, finalRadius);
            myView.setVisibility(View.VISIBLE);
            anim.start();

        } else {
            Intent i = new Intent(this, InOutExplodeActivity.class);
            startActivity(i, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
            //startActivity(i, null);//llamando así, evito la transición definida en style
        }

        // previously visible view


        return super.onOptionsItemSelected(item);
    }
}
