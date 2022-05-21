package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Noun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun);
        TextView textView;
        textView=findViewById(R.id.textView3);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("Noun"));

    }
}