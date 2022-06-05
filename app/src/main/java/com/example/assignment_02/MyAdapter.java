package com.example.assignment_02;

import android.annotation.SuppressLint;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Question>  {
    Button choice1,choice2,choice3,choice4;
    TextView textViewstatement,correctanswer;
    Question question;
    int result=0;
    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        question = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_quiz, parent, false);
        textViewstatement = convertView.findViewById(R.id.textView5);
        choice1 = convertView.findViewById(R.id.button3);
        choice2 = convertView.findViewById(R.id.button8);
        choice3 = convertView.findViewById(R.id.button9);
        choice4 = convertView.findViewById(R.id.button10);
        choice1.setBackgroundResource(R.color.backcolor);
        choice2.setBackgroundResource(R.color.backcolor);
        choice3.setBackgroundResource(R.color.backcolor);
        choice4.setBackgroundResource(R.color.backcolor);
        correctanswer = convertView.findViewById(R.id.textView6);

        textViewstatement.setText(question.statement);
        choice1.setText(question.opt1);
        choice2.setText(question.opt2);
        choice3.setText(question.opt3);
        choice4.setText(question.opt4);

        return convertView;
    }
    public MyAdapter(Context context, ArrayList<Question> QuestionArrayList)
    {
        super(context, 0, QuestionArrayList);
        choice1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"ResourceAsColor", "SetTextI18n"})


            @Override
            public void onClick(View view) {

                if (choice1.getText().toString().equals(question.ans)) {
                    correctanswer.setText("Correct Answer:   " + question.ans);

                    result++;
                    choice1.setText("CORRECT");
                    choice1.setBackgroundResource(R.color.green);
                } else {
                    choice1.setText("INCORRECT");
                    choice1.setBackgroundResource(R.color.red);
                    if (choice2.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice2.setText("CORRECT");
                        choice2.setBackgroundResource(R.color.green);
                    } else if (choice3.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice3.setText("CORRECT");
                        choice3.setBackgroundResource(R.color.green);
                    } else if (choice4.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice4.setText("CORRECT");
                        choice4.setBackgroundResource(R.color.green);
                    }
                }


            }

        });

        choice2.findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"ResourceAsColor", "SetTextI18n"})
            @Override
            public void onClick(View view) {
                if (choice2.getText().toString().equals(question.ans)) {
                    correctanswer.setText("Correct Answer:   " + question.ans);

                    result++;
                    choice2.setText("CORRECT");
                    choice2.setBackgroundResource(R.color.green);
                } else {
                    choice2.setText("INCORRECT");
                    choice2.setBackgroundResource(R.color.red);
                    if (choice1.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice1.setText("CORRECT");
                        choice1.setBackgroundResource(R.color.green);
                    } else if (choice3.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice3.setText("CORRECT");
                        choice3.setBackgroundResource(R.color.green);
                    } else if (choice4.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice4.setText("CORRECT");
                        choice4.setBackgroundResource(R.color.green);
                    }
                }
            }
        });



        choice3.findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"ResourceAsColor", "SetTextI18n"})

            @Override
            public void onClick(View view) {
                if (choice3.getText().toString().equals(question.ans)) {
                    correctanswer.setText("Correct Answer:   " + question.ans);

                    result++;
                    choice3.setText("CORRECT");
                    choice3.setBackgroundResource(R.color.green);
                } else {
                    choice3.setText("INCORRECT");
                    choice3.setBackgroundResource(R.color.red);
                    if (choice1.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice1.setText("CORRECT");
                        choice1.setBackgroundResource(R.color.green);
                    } else if (choice2.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice2.setText("CORRECT");
                        choice2.setBackgroundResource(R.color.green);
                    } else if (choice4.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice4.setText("CORRECT");
                        choice4.setBackgroundResource(R.color.green);
                    }
                }


            }});
        choice4.findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice4.getText().toString().equals(question.ans)) {
                    correctanswer.setText("Correct Answer:   " + question.ans);

                    result++;
                    choice4.setText("CORRECT");

                    choice4.setBackgroundResource(R.color.green);
                } else {
                    choice4.setText("INCORRECT");
                    choice4.setBackgroundResource(R.color.red);
                    if (choice2.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice2.setText("CORRECT");
                        choice2.setBackgroundResource(R.color.green);
                    } else if (choice3.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice3.setText("CORRECT");
                        choice3.setBackgroundResource(R.color.green);
                    } else if (choice4.getText().toString().equals(question.ans)) {
                        correctanswer.setText("Correct Answer:   " + question.ans);


                        choice1.setText("CORRECT");
                        choice1.setBackgroundResource(R.color.green);
                    }
                }

            }
        });
    }


  }


