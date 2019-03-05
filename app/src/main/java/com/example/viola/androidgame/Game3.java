package com.example.viola.androidgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Game3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game3);
    }
    public void showend1(View view){
        Intent intent = new Intent();
        intent.setClass(Game3.this,end1.class);
        startActivity(intent);
    }
    public void showend2(View view){
        Intent intent = new Intent();
        intent.setClass(Game3.this,end2.class);
        startActivity(intent);
    }
}