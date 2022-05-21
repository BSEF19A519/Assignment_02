package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Noun(View view) {
        Intent intent = new Intent(Menu.this, Noun.class);

        String noun = "What Is a Noun?\n" +
                "Nouns are everywhere in our writing. But what are all the types of nouns you come across, and how do you use them?\n" +
                "What is a noun?\n" +
                "A noun is a word that names something, such as a person, place, thing, or idea. In a sentence, nouns can play the role of subject, direct object, indirect object, subject complement, object complement, appositive, or adjective.\n" +
                "\n" +

               "Types of nouns" +
                "Nouns form a large proportion of English vocabulary and they come in a wide variety of types. Nouns can name a person:" +
                "Albert Einstein" +
                "the president"+
                "Nouns can also name a place:" +
                "Mount Vesuvius" +
                "Disneyland" +
                "Nouns can also name things, although sometimes they might be intangible things, such as concepts, activities, or processes. Some might even be hypothetical or imaginary things." +
                "shoe" +
                "faucet";

        intent.putExtra("Noun", noun);
        startActivity(intent);


    }

    public void Pronouns(View view) {
        Intent intent = new Intent(Menu.this, Pronoun.class);
        String pronoun = "";
        intent.putExtra("Pronoun", pronoun);
        startActivity(intent);
    }

    public void Adjectives(View view) {
        Intent intent = new Intent(Menu.this, Adjectives.class);
        String adjectives = "";
        intent.putExtra("Adjectives", adjectives);
        startActivity(intent);
    }

    public void Adverbs(View view) {
        Intent intent = new Intent(Menu.this, Adverb.class);
        String adverb = "";
        intent.putExtra("Adverb", adverb);
        startActivity(intent);
    }

    public void Verbs(View view) {
        Intent intent = new Intent(Menu.this, Verb.class);
        String verbs= "";
        intent.putExtra("Verb", verbs);
        startActivity(intent);
    }

    public void Prepositions(View view) {
        Intent intent = new Intent(Menu.this, Prepositions.class);
        String prep = "";
        intent.putExtra("Prepositions", prep);
        startActivity(intent);
    }

    public void Conjunctions(View view) {
        Intent intent = new Intent(Menu.this, Conjuctions.class);
        String conjunction = "";
        intent.putExtra("Conjunctions", conjunction);
        startActivity(intent);
    }

    public void Articles(View view) {
        Intent intent = new Intent(Menu.this, Articles.class);
        String article = "";
        intent.putExtra("Articles", article);
        startActivity(intent);
    }

    public void Quiz(View view) {
        Intent intent = new Intent(Menu.this, Quiz.class);
        startActivity(intent);
    }
}