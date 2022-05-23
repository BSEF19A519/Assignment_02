package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textView1,txtview2;
        textView1=findViewById(R.id.textView14);
        txtview2=findViewById(R.id.textView15);

        Intent intent = getIntent();
        textView1.setText(intent.getStringExtra("result"));
        txtview2.setText(intent.getStringExtra("msg"));
    }

    public void Back(View view) {
        Intent intent = new Intent(Result.this, MainActivity.class);
        startActivity(intent);
    }
}