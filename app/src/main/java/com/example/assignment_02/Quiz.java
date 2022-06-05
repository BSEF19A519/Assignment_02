package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_list_view);
        ListView listView;
        listView = findViewById(R.id.quizlist);
        ArrayList<Question> questionsArrayList = new ArrayList<Question>();
        questionsArrayList.add(new Question("1. I bought a BEAUTIFUL dress at mall.", "Preposition", "Noun", "Adverb", "Adjective", "Adjective"));
        questionsArrayList.add(new Question("2. What did SHE ask you to do?", "Conjunction", "Pronoun", "Adverb", "Adjective", "Pronoun"));
        questionsArrayList.add(new Question("3. The baby crawled UNDER the bed.", "Verb", "Pronoun", "Preposition", "Adjective", "Preposition"));
        questionsArrayList.add(new Question("4. She QUICKLY packed her bag and left.", "Articles", "Adverb", "Noun", "Preposition", "Adverb"));
        questionsArrayList.add(new Question("5. TAKE your first left then go over the bridge.", "Pronoun", "Noun", "Preposition", "Verb", "Verb"));


        MyAdapter adapter = new MyAdapter(this, questionsArrayList);

        listView.setAdapter(adapter);




    }


}