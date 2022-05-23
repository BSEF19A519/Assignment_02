package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
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
    boolean flag1=false,flag2=false,flag3=false,flag4=false;
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
        flag4=true;
        Options();


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                flag1=flag2=flag3=flag4=false;
                    choice1.setBackgroundResource(R.color.backcolor);
                    choice2.setBackgroundResource(R.color.backcolor);
                    choice3.setBackgroundResource(R.color.backcolor);
                    choice4.setBackgroundResource(R.color.backcolor);

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
                            flag2=true;
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
                            flag3=true;
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
                            flag2=true;
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
                            flag4=true;
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
                            flag2=true;
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
                            flag4=true;
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
                            flag2=true;
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
                            flag2=true;
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
                            flag2=true;
                            Options();
                            break;
                        case 11:
                            textView.setText(HtmlCompat.fromHtml("11. What part of speech describes a verb,adjective or a adverb and answers when?where?how? and to what extent?",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Verb");
                            choice2.setText("Adjective");
                            choice3.setText("Adverb");
                            choice4.setText("Preposition");
                            answer="Adverb";
                            flag3=true;
                            Options();
                            break;
                        case 12:
                            textView.setText(HtmlCompat.fromHtml("12. What part of speech connects words or groups of words?Examples are for ,and,nor,but,or,yet,so?",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Noun");
                            choice2.setText("Pronoun");
                            choice3.setText("Adverb");
                            choice4.setText("Conjunction");
                            answer="Conjunction";
                            flag4=true;
                            Options();
                            break;
                        case 13:
                            textView.setText(HtmlCompat.fromHtml("13. What type of pronouns are I,we,she ,they,him,us?They refer to \"people\".",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Personal Pronoun");
                            choice2.setText("Reflexive Pronoun");
                            choice3.setText("Relative Pronoun");
                            choice4.setText("Reciprocal Pronoun");
                            answer="Personal Pronoun";
                            flag1=true;
                            Options();
                            break;
                        case 14:
                            textView.setText(HtmlCompat.fromHtml("14. Robert was and unwise king. He was the king of seven kingdoms.What type of pronoun is found in this sentence?",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Subject");
                            choice2.setText("Object");
                            choice3.setText("Not clear");
                            choice4.setText("None");
                            answer="Subject";
                            flag1=true;
                            Options();
                            break;
                        case 15:
                            textView.setText(HtmlCompat.fromHtml("15. A verb that describes physical or mental action is called wht type of verb?",HtmlCompat.FROM_HTML_MODE_LEGACY));
                            correctanswer.setText("Correct Answer:");
                            choice1.setText("Helping Verb");
                            choice2.setText("Linking Verb");
                            choice3.setText("Action Verb");
                            choice4.setText("None");
                            answer="Action Verb";
                            flag3=true;
                            Options();
                            break;
                        case 16:
//
                            Intent intent = new Intent(Quiz.this, Result.class);
                            String rslt="Score:   "+result+"/15";
                            if(result<9)
                            {
                                intent.putExtra("result", rslt);
                                intent.putExtra("msg", "Do your best next time!!!");
                            }
                            else
                            {
                                intent.putExtra("result", rslt);
                                intent.putExtra("msg", "Well Done!!!");
                            }

                            startActivity(intent);
                            break;

                        default:
                            break;


                    }
                }


        });


    }
    public void Options()
    {
   //for(int i=0;i<1;i++) {
       choice1.setOnClickListener(new View.OnClickListener() {
           @SuppressLint({"ResourceAsColor", "SetTextI18n"})
           @Override
           public void onClick(View view) {
               if (choice1.getText().toString().equals(answer)) {
                   correctanswer.setText("Correct Answer:   " + answer);
                   count++;
                   result++;
                   choice1.setText("CORRECT");
                   choice1.setBackgroundResource(R.color.green);
               } else {
                   choice1.setText("INCORRECT");
                   choice1.setBackgroundResource(R.color.red);
                   if (flag2 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice2.setText("CORRECT");
                       choice2.setBackgroundResource(R.color.green);
                   } else if (flag3 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice3.setText("CORRECT");
                       choice3.setBackgroundResource(R.color.green);
                   } else if (flag4 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice4.setText("CORRECT");
                       choice4.setBackgroundResource(R.color.green);
                   }
               }


           }
       });

       choice2.setOnClickListener(new View.OnClickListener() {
           @SuppressLint({"ResourceAsColor", "SetTextI18n"})
           @Override
           public void onClick(View view) {
               if (choice2.getText().toString().equals(answer)) {
                   correctanswer.setText("Correct Answer:   " + answer);
                   count++;
                   result++;
                   choice2.setText("CORRECT");
                   choice2.setBackgroundResource(R.color.green);
               } else {
                   choice2.setText("INCORRECT");
                   choice2.setBackgroundResource(R.color.red);
                   if (flag1 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice1.setText("CORRECT");
                       choice1.setBackgroundResource(R.color.green);
                   } else if (flag3 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice3.setText("CORRECT");
                       choice3.setBackgroundResource(R.color.green);
                   } else if (flag4 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice4.setText("CORRECT");
                       choice4.setBackgroundResource(R.color.green);
                   }
               }
           }
       });
       choice3.setOnClickListener(new View.OnClickListener() {
           @SuppressLint({"ResourceAsColor", "SetTextI18n"})
           @Override
           public void onClick(View view) {
               if (choice3.getText().toString().equals(answer)) {
                   correctanswer.setText("Correct Answer:   " + answer);
                   count++;
                   result++;
                   choice3.setText("CORRECT");
                   choice3.setBackgroundResource(R.color.green);
               } else {
                   choice3.setText("INCORRECT");
                   choice3.setBackgroundResource(R.color.red);
                   if (flag1 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice1.setText("CORRECT");
                       choice1.setBackgroundResource(R.color.green);
                   } else if (flag2 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice2.setText("CORRECT");
                       choice2.setBackgroundResource(R.color.green);
                   } else if (flag4 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice4.setText("CORRECT");
                       choice4.setBackgroundResource(R.color.green);
                   }
               }
           }
       });
       choice4.setOnClickListener(new View.OnClickListener() {
           @SuppressLint({"ResourceAsColor", "SetTextI18n"})
           @Override
           public void onClick(View view) {
               if (choice4.getText().toString().equals(answer)) {
                   correctanswer.setText("Correct Answer:   " + answer);
                   count++;
                   result++;
                   choice4.setText("CORRECT");

                   choice4.setBackgroundResource(R.color.green);
               } else {
                   choice4.setText("INCORRECT");
                   choice4.setBackgroundResource(R.color.red);
                   if (flag2 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice2.setText("CORRECT");
                       choice2.setBackgroundResource(R.color.green);
                   } else if (flag3 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice3.setText("CORRECT");
                       choice3.setBackgroundResource(R.color.green);
                   } else if (flag1 == true) {
                       correctanswer.setText("Correct Answer:   " + answer);
                       count++;

                       choice1.setText("CORRECT");
                       choice1.setBackgroundResource(R.color.green);
                   }
               }
           }
       });
   //}

    }


}