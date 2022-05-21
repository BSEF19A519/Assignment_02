package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {
    Button choice1,choice2,choice3,choice4,nextbtn;
    TextView textView,correctanswer;
    String answer;
    int count=1;
    int result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        choice1=findViewById(R.id.button3);
        choice2=findViewById(R.id.button8);
        choice3=findViewById(R.id.button9);
        choice4=findViewById(R.id.button10);
        nextbtn=findViewById(R.id.button11);
        textView=findViewById(R.id.textView5);
        correctanswer=findViewById(R.id.textView6);
        textView.setText(HtmlCompat.fromHtml("1. I bought a <b>BEAUTIFUL</b> dress at mall.",HtmlCompat.FROM_HTML_MODE_LEGACY));
        choice1.setText("Preposition");
        choice2.setText("Noun");
        choice3.setText("Adverb");
        choice4.setText("Adjective");
        answer="Adjective";
        Options();

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    switch (count)
                    {
                        case 2:
                            textView.setText(HtmlCompat.fromHtml("2. What did <b>SHE</b> ask you to do?",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Conjunction");
                            choice2.setText("Pronoun");
                            choice3.setText("Adverb");
                            choice4.setText("Adjective");
                            answer="Pronoun";
                            Options();
                            break;
                        case 3:
                            textView.setText(HtmlCompat.fromHtml("3. The baby crawled <b>UNDER</b> the bed.",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Verb");
                            choice2.setText("Pronoun");
                            choice3.setText("Preposition");
                            choice4.setText("Adjective");
                            answer="Preposition";
                            Options();
                            break;
                        case 4:
                            textView.setText(HtmlCompat.fromHtml("4. She <b>QUICKLY</b> packed her bag and left.",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Articles");
                            choice2.setText("Adverb");
                            choice3.setText("Preposition");
                            choice4.setText("Noun");
                            answer="Adverb";
                            Options();
                            break;
                        case 5:
                            textView.setText(HtmlCompat.fromHtml("5. <b>TAKE</b> your first left then go over the bridge.",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Pronoun");
                            choice2.setText("Noun");
                            choice3.setText("Preposition");
                            choice4.setText("Verb");
                            answer="Verb";
                            Options();
                            break;
                        case 6:
                            textView.setText(HtmlCompat.fromHtml("6. The resort opens _____ spring.",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("at");
                            choice2.setText("in");
                            choice3.setText("on");
                            choice4.setText("the");
                            answer="in";
                            Options();
                            break;
                        case 7:
                            textView.setText(HtmlCompat.fromHtml("7. Verbs are one type of word, and _____ are another type of word.",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Pronouns");
                            choice2.setText("Sentences");
                            choice3.setText("Letters");
                            choice4.setText("Nouns");
                            answer="Nouns";
                            Options();
                            break;
                        case 8:
                            textView.setText(HtmlCompat.fromHtml("8. Different parts of speech have different jobs. What do verbs like \"run\" and \"learn\" do?",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Express Things");
                            choice2.setText("Express Actions");
                            choice3.setText("Tell us more about Noun");
                            choice4.setText("None");
                            answer="Express Actions";
                            Options();
                            break;
                        case 9:
                            textView.setText(HtmlCompat.fromHtml("9. Do you like your teacher?Which word is and adjective?",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Like");
                            choice2.setText("New");
                            choice3.setText("Teacher");
                            choice4.setText("All of the above");
                            answer="New";
                            Options();
                            break;
                        case 10:
                            textView.setText(HtmlCompat.fromHtml("10. Which of the following is compound conjunction?",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("So big that");
                            choice2.setText("As long as");
                            choice3.setText("Although");
                            choice4.setText("As well");
                            answer="As long as";
                            Options();
                            break;
                        case 11:
                            textView.setText(result+"/10");
                            if(result<6)
                            {
                                correctanswer.setText("Do your best nexttime!!!");
                                nextbtn.setText("Over");
                            }
                            else
                            {
                                correctanswer.setText("Well done!!!");
                                nextbtn.setText("Over");
                            }
                            break;

                        default:
                            break;


                    }
                }


        });


    }
    public void Options()
    {
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice1.getText().toString().equals(answer))
                {
                    correctanswer.setText("Correct Answer:"+answer);
                    count++;
                    result++;
                    choice1.setText("CORRECT");
                }
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice2.getText().toString().equals(answer))
                {
                    correctanswer.setText("Correct Answer:"+answer);
                    count++;
                    result++;
                    choice2.setText("CORRECT");
                }
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice3.getText().toString().equals(answer))
                {
                    correctanswer.setText("Correct Answer:"+answer);
                    count++;
                    result++;
                    choice3.setText("CORRECT");
                }
            }
        });
        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice4.getText().toString().equals(answer))
                {
                    correctanswer.setText("Correct Answer:"+answer);
                    count++;
                    result++;
                    choice4.setText("CORRECT");
                }
            }
        });
    }


}