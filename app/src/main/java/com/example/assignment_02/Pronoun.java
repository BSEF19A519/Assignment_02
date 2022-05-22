package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Pronoun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronoun);
        TextView textView;
        textView=findViewById(R.id.textView12);
        textView.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("Pronoun"));
    }
}