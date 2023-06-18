package com.company;

public class theoryCourse {
    private int numberClassAttended = -1;
    private int numberClass = -1;
    private int quiz1 = -1;
    private int quiz2 = -1;
    private int quiz3 = -1;
    private int assignment = -1;
    private int presentation = -1;
    private int midTerm = -1;
    private int finalTerm = -1;
    public theoryCourse(){
        int number1,number,quizNumber;
        number1 = inputValidityChecker.getValidInput("Number of total class conducted: ");
        setNumberClass(number1);
        number = inputValidityChecker.getValidMarkInput("Number of total class attended: ",number1 );
        setNumberClassAttended(number);
        quizNumber = inputValidityChecker.getValidMarkInput("Quiz-1 Mark (Max 15): ",15 );
        setQuiz1(quizNumber);
        quizNumber = inputValidityChecker.getValidMarkInput("Quiz-2 Mark (Max 15): ",15 );
        setQuiz2(quizNumber);
        quizNumber = inputValidityChecker.getValidMarkInput("Quiz-3 Mark (Max 15): ",15 );
        setQuiz3(quizNumber);
        number = inputValidityChecker.getValidMarkInput("Assignment Mark (Max 5): ",5 );
        setAssignment(number);
        number = inputValidityChecker.getValidMarkInput("Presentation Mark (Max 8): ",8 );
        setPresentation(number);
        number = inputValidityChecker.getValidMarkInput("Mid-Term Mark (Max 25): ",25 );
        setMidTerm(number);
        number = inputValidityChecker.getValidMarkInput("Final Term Mark (Max 40): ",40 );
        setFinalTerm(number);
    }
    private void setNumberClassAttended(int numberClassAttended){
        this.numberClassAttended = numberClassAttended;
    }
    private void setNumberClass(int numberClass){
        this.numberClass = numberClass;
    }
    private void setQuiz1(int quiz1){
        this.quiz1 = quiz1;
    }
    private void setQuiz2(int quiz2){
        this.quiz2 = quiz2;
    }
    private void setQuiz3(int quiz3){
        this.quiz3 = quiz3;
    }
    private void setAssignment(int assignment){
        this.assignment = assignment;
    }
    private void setPresentation(int presentation){
        this.presentation = presentation;
    }
    private void setMidTerm(int midTerm){
        this.midTerm = midTerm;
    }
    private void setFinalTerm(int finalTerm){
        this.finalTerm = finalTerm;
    }
    private float getAttendance(){
        return (float)(((float)this.numberClassAttended/(float)this.numberClass) * 7.0);
    }
    private float getQuiz(){
        return (float) ((this.quiz1+this.quiz2+this.quiz3)/3.0);
    }
    public int getTotal(){
        return  (int) ((Math.ceil(this.getAttendance())) + (Math.ceil(this.getQuiz()))+ this.assignment + this.presentation + this.midTerm + this.finalTerm);
    }
}
