package com.example.viola.androidgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class end1 extends BaseActivity {
    private Button btnend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end1);
        btnend=findViewById(R.id.btnend1);
        btnend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });

    }

    public void showgame1(View view){
        Intent intent = new Intent();
        intent.setClass(end1.this,MainActivity.class);
        startActivity(intent);
    }

}