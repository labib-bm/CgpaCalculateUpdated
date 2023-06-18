package com.company;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Number of total class: ");
        number = sc.nextInt();
        setNumberClass(number);
        System.out.print("Number of total class attended: ");
        number = sc.nextInt();
        setNumberClassAttended(number);
        System.out.print("Quiz 1: ");
        number = sc.nextInt();
        setQuiz1(number);
        System.out.print("Quiz 2: ");
        number = sc.nextInt();
        setQuiz2(number);
        System.out.print("Quiz 3: ");
        number = sc.nextInt();
        setQuiz3(number);
        System.out.print("Assignment: ");
        number = sc.nextInt();
        setAssignment(number);
        System.out.print("Presentation: ");
        number = sc.nextInt();
        setPresentation(number);
        System.out.print("Mid-Term: ");
        number = sc.nextInt();
        setMidTerm(number);
        System.out.print("Final Term: ");
        number = sc.nextInt();
        setFinalTerm(number);
        System.out.println(Math.ceil(getAttendance()));
        System.out.println(Math.ceil(getQuiz()));
        System.out.println(assignment);
        System.out.println(presentation);
        System.out.println(midTerm);
        System.out.println(finalTerm);
        System.out.println(getTotal());
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
