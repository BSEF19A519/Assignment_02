package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Adverb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adverb);
        TextView textView;
        textView=findViewById(R.id.textView7);
        textView.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("Adverb"));
    }
}