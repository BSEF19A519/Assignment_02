package com.example.assignment_02;

public class Question {
    public String statement;
    public String opt1;
    public String opt2;
    public String opt3;
    public String opt4;
    public String ans;


    public Question(String statement, String opt1, String opt2,String opt3,String opt4,String ans)
    {
        this.statement = statement;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans=ans;
    }


}
