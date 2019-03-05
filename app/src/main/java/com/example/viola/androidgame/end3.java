package com.example.viola.androidgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class end3 extends AppCompatActivity {
    private Button btnend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end3);
        btnend=findViewById(R.id.btnend3);
        btnend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });
    }
    public void showgame1(View view){
        Intent intent = new Intent();
        intent.setClass(end3.this,MainActivity.class);
        startActivity(intent);
    }


}