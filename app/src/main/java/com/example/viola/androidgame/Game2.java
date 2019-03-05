package com.example.viola.androidgame;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Game2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game2);
    }
    public void showgame3(View view){
        Intent intent = new Intent();
        intent.setClass(Game2.this,Game3.class);
        startActivity(intent);
    }
    public void showend3(View view){
        Intent intent = new Intent();
        intent.setClass(Game2.this,end3.class);
        startActivity(intent);
    }
}