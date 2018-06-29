package com.example.vardan.week1_exercices_4a;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivitySeekBar extends AppCompatActivity {

    private int a, k, c;
    private LinearLayout linl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainseekbar);

        linl = findViewById(R.id.lay);
        final TextView textView1 = findViewById(R.id.text1);
        final TextView textView2 = findViewById(R.id.text2);
        final TextView textView3 = findViewById(R.id.text3);
        SeekBar seekBar1 = findViewById(R.id.seekbar1);
        SeekBar seekBar2 = findViewById(R.id.seekbar2);
        SeekBar seekBar3 = findViewById(R.id.seekbar3);


        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                textView1.setText(i + "");
                a = i;
                poxiGuynd();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView2.setText(i + "");
                k = i;
                poxiGuynd();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView3.setText(i + "");
                c = i;
                poxiGuynd();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void poxiGuynd() {
        int color = Color.rgb(a, k, c);
        linl.setBackgroundColor(color);
    }
}
