package com.example.uobdrinkinggames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;

public class Guides extends AppCompatActivity {
    boolean[] visible_descs = new boolean[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guides);
        hideAllDescs();
    }

    public void hideAllDescs() {
        ArrayList<View> viewsToHide = new ArrayList<View>();
        viewsToHide.add(findViewById(R.id.fTheDealerGuide));
        viewsToHide.add(findViewById(R.id.pyramidGuide1));
        viewsToHide.add(findViewById(R.id.pyramidGuide2));
        viewsToHide.add(findViewById(R.id.pyramidDiagram));
        for (View v : viewsToHide) {
            v.setVisibility(View.GONE);
        }
        Arrays.fill(visible_descs, false);
    }

    public void fTheDealer(View view) {
        if (visible_descs[0]) {
            findViewById(R.id.fTheDealerGuide).setVisibility(View.GONE);
        } else {
            findViewById(R.id.fTheDealerGuide).setVisibility(View.VISIBLE);
        }
        visible_descs[0] = !visible_descs[0];
    }

    public void pyramidGuide(View view) {
        if (visible_descs[1]) {
            findViewById(R.id.pyramidGuide1).setVisibility(View.GONE);
            findViewById(R.id.pyramidGuide2).setVisibility(View.GONE);
            findViewById(R.id.pyramidDiagram).setVisibility(View.GONE);
        } else {
            findViewById(R.id.pyramidGuide1).setVisibility(View.VISIBLE);
            findViewById(R.id.pyramidGuide2).setVisibility(View.VISIBLE);
            findViewById(R.id.pyramidDiagram).setVisibility(View.VISIBLE);
        }
        visible_descs[1] = !visible_descs[1];
    }
}