package com.example.viola.androidgame;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Game1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game1);
    }
    public void showgame2(View view){
        Intent intent = new Intent();
        intent.setClass(Game1.this,Game2.class);
        startActivity(intent);
    }
    public void showend4(View view){
        Intent intent = new Intent();
        intent.setClass(Game1.this,end4.class);
        startActivity(intent);
    }

}