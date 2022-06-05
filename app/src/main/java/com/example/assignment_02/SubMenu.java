package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class SubMenu extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);
        TextView textView,head;
        textView=findViewById(R.id.textView17);
        head=findViewById(R.id.textView16);
        textView.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = getIntent();
        String type=intent.getStringExtra("Type");
        switch (type) {
            case "Noun":
                head.setText("Noun");
                textView.setText(intent.getStringExtra("Noun"));

                break;
            case "Articles":
                head.setText("Articles");
                textView.setText(intent.getStringExtra("Articles"));

                break;
            case "Adjectives":
                head.setText("Adjectives");
                textView.setText(intent.getStringExtra("Adjectives"));

                break;
            case "Conjunctions":
                head.setText("Conjunctions");
                textView.setText(intent.getStringExtra("Conjunctions"));

                break;
            case "Verb":
                head.setText("Verb");
                textView.setText(intent.getStringExtra("Verb"));

                break;
            case "Prepositions":
                head.setText("Prepositions");
                textView.setText(intent.getStringExtra("Prepositions"));

                break;
            case "Adverb":
                head.setText("Adverb");
                textView.setText(intent.getStringExtra("Adverb"));

                break;
            case "Pronoun":
                head.setText("Pronoun");
                textView.setText(intent.getStringExtra("Pronoun"));

                break;
            default:
                break;



        }


    }
}