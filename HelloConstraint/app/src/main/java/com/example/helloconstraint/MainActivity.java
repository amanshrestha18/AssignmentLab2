package com.example.helloconstraint;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.MediaCas;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private int zero = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
//        code for button count goes here
        mCount ++;
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }


        switch (mCount % 2){
//            if mCount mod 2 is 0, number is even otherwise odd
            case 0: view.setBackgroundColor(Color.rgb(212,32,32));
                break;
            case 1: view.setBackgroundColor(Color.rgb(12,67,12));
                break;
            default: break;
        }
    }


    public void resetZero(View view) {
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(zero));
        mCount = 0;

        }





    }

