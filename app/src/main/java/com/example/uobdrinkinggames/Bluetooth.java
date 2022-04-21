package com.example.uobdrinkinggames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Bluetooth extends AppCompatActivity {
     public static final int MAX_PLAYERS = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString("name");
            TextView player1 = (TextView)findViewById(R.id.player1);
            player1.setText(username);
        }
    }
}