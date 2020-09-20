package com.example.tapbuttoncounterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //buttons
    private Button button;
    private Button reset;
    private Button quit;

    //textview
    private TextView totalTaps;

    //counter
    private int taps = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        reset = (Button) findViewById(R.id.reset);
        quit = (Button) findViewById(R.id.exit);
        totalTaps = (TextView) findViewById(R.id.totalTaps);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taps++;
                totalTaps.setText(Integer.toString(taps));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taps = 0;
                totalTaps.setText(Integer.toString(taps));
            }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taps = 0;
                System.exit(0);
            }
        });
    }


}