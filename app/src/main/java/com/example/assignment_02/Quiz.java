package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        ListView listView;

        ArrayList<Question> questionsArrayList = new ArrayList<Question>();
        questionsArrayList.add(new Question("1. I bought a <b>BEAUTIFUL</b> dress at mall.", "Preposition", "Noun", "Adverb", "Adjective", "Adjective"));
        questionsArrayList.add(new Question("2. What did <b>SHE</b> ask you to do?", "Conjunction", "Pronoun", "Adverb", "Adjective", "Pronoun"));
        questionsArrayList.add(new Question("3. The baby crawled <b>UNDER</b> the bed.", "Verb", "Pronoun", "Preposition", "Adjective", "Preposition"));
        questionsArrayList.add(new Question("4. She <b>QUICKLY</b> packed her bag and left.", "Articles", "Adverb", "Noun", "Preposition", "Adverb"));
        questionsArrayList.add(new Question("5. <b>TAKE</b> your first left then go over the bridge.", "Pronoun", "Noun", "Preposition", "Verb", "Verb"));
//        questionsArrayList.add(new Question("6. What did <b>SHE</b> ask you to do?", "Conjunction", "Pronoun", "Adverb", "Adjective", "Pronoun"));
//        questionsArrayList.add(new Question("7. What did <b>SHE</b> ask you to do?", "Conjunction", "Pronoun", "Adverb", "Adjective", "Pronoun"));
//        questionsArrayList.add(new Question("8. What did <b>SHE</b> ask you to do?", "Conjunction", "Pronoun", "Adverb", "Adjective", "Pronoun"));
//        questionsArrayList.add(new Question("9. What did <b>SHE</b> ask you to do?", "Conjunction", "Pronoun", "Adverb", "Adjective", "Pronoun"));
//        questionsArrayList.add(new Question("10. What did <b>SHE</b> ask you to do?", "Conjunction", "Pronoun", "Adverb", "Adjective", "Pronoun"));

        MyAdapter adapter = new MyAdapter(this, questionsArrayList);
        listView = findViewById(R.id.quizlist);
        listView.setAdapter(adapter);


//
//
//
//                        case 6:
//                            textView.setText(HtmlCompat.fromHtml("6. The resort opens _____ spring.",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("at");
//                            choice2.setText("in");
//                            choice3.setText("on");
//                            choice4.setText("the");
//                            answer="in";
//                            flag2=true;
//                            Options();
//                            break;
//                        case 7:
//                            textView.setText(HtmlCompat.fromHtml("7. Verbs are one type of word, and _____ are another type of word.",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("Pronouns");
//                            choice2.setText("Sentences");
//                            choice3.setText("Letters");
//                            choice4.setText("Nouns");
//                            answer="Nouns";
//                            flag4=true;
//                            Options();
//                            break;
//                        case 8:
//                            textView.setText(HtmlCompat.fromHtml("8. Different parts of speech have different jobs. What do verbs like \"run\" and \"learn\" do?",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("Express Things");
//                            choice2.setText("Express Actions");
//                            choice3.setText("Tell us more about Noun");
//                            choice4.setText("None");
//                            answer="Express Actions";
//                            flag2=true;
//                            Options();
//                            break;
//                        case 9:
//                            textView.setText(HtmlCompat.fromHtml("9. Do you like your teacher?Which word is and adjective?",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("Like");
//                            choice2.setText("New");
//                            choice3.setText("Teacher");
//                            choice4.setText("All of the above");
//                            answer="New";
//                            flag2=true;
//                            Options();
//                            break;
//                        case 10:
//                            textView.setText(HtmlCompat.fromHtml("10. Which of the following is compound conjunction?",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("So big that");
//                            choice2.setText("As long as");
//                            choice3.setText("Although");
//                            choice4.setText("As well");
//                            answer="As long as";
//                            flag2=true;
//                            Options();
//                            break;
//                        case 11:
//                            textView.setText(HtmlCompat.fromHtml("11. What part of speech describes a verb,adjective or a adverb and answers when?where?how? and to what extent?",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("Verb");
//                            choice2.setText("Adjective");
//                            choice3.setText("Adverb");
//                            choice4.setText("Preposition");
//                            answer="Adverb";
//                            flag3=true;
//                            Options();
//                            break;
//                        case 12:
//                            textView.setText(HtmlCompat.fromHtml("12. What part of speech connects words or groups of words?Examples are for ,and,nor,but,or,yet,so?",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("Noun");
//                            choice2.setText("Pronoun");
//                            choice3.setText("Adverb");
//                            choice4.setText("Conjunction");
//                            answer="Conjunction";
//                            flag4=true;
//                            Options();
//                            break;
//                        case 13:
//                            textView.setText(HtmlCompat.fromHtml("13. What type of pronouns are I,we,she ,they,him,us?They refer to \"people\".",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("Personal Pronoun");
//                            choice2.setText("Reflexive Pronoun");
//                            choice3.setText("Relative Pronoun");
//                            choice4.setText("Reciprocal Pronoun");
//                            answer="Personal Pronoun";
//                            flag1=true;
//                            Options();
//                            break;
//                        case 14:
//                            textView.setText(HtmlCompat.fromHtml("14. Robert was and unwise king. He was the king of seven kingdoms.What type of pronoun is found in this sentence?",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("Subject");
//                            choice2.setText("Object");
//                            choice3.setText("Not clear");
//                            choice4.setText("None");
//                            answer="Subject";
//                            flag1=true;
//                            Options();
//                            break;
//                        case 15:
//                            textView.setText(HtmlCompat.fromHtml("15. A verb that describes physical or mental action is called wht type of verb?",HtmlCompat.FROM_HTML_MODE_LEGACY));
//                            correctanswer.setText("Correct Answer:");
//                            choice1.setText("Helping Verb");
//                            choice2.setText("Linking Verb");
//                            choice3.setText("Action Verb");
//                            choice4.setText("None");
//                            answer="Action Verb";
//                            flag3=true;
//                            Options();
//                            break;

//
//                            Intent intent = new Intent(Quiz.this, Result.class);
//                            String rslt="Score:   "+result+"/15";
//                            if(result<9)
//                            {
//                                intent.putExtra("result", rslt);
//                                intent.putExtra("msg", "Do your best next time!!!");
//                            }
//                            else
//                            {
//                                intent.putExtra("result", rslt);
//                                intent.putExtra("msg", "Well Done!!!");
//                            }
//
//                            startActivity(intent);
//                            break;
//
//                        default:
//                            break;
//
//
//                    }
//                }


//        });


    }


}