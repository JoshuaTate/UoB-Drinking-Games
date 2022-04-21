package com.example.uobdrinkinggames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import android.content.Intent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main();
    }

    public void main() {
        //https://stackoverflow.com/questions/36651600/how-fade-in-a-button-in-android
        ArrayList<View> viewsToFadeIn = new ArrayList<View>();
        viewsToFadeIn.add(findViewById(R.id.splashDesc));
        viewsToFadeIn.add(findViewById(R.id.guidesDesc));
        viewsToFadeIn.add(findViewById(R.id.playDesc));
        viewsToFadeIn.add(findViewById(R.id.play));
        viewsToFadeIn.add(findViewById(R.id.guides));
        for (View v : viewsToFadeIn) {
            v.setAlpha(0); // make invisible to start
        }
        for (View v : viewsToFadeIn) {
            v.animate().alpha(1.0f).setDuration(1500).start();
        }
    }

    public void guides(View view) {
        Intent intent = new Intent(this, Guides.class);
        startActivity(intent);
    }

    public void play(View view) {
        Intent intent = new Intent(this, Lobby.class);
        startActivity(intent);
    }
}