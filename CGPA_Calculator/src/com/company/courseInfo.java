package com.company;

import java.util.Scanner;

public class courseInfo {
    private String courseName = null;
    private int courseCredit = -1;
    public courseInfo(){

    }
    public void setCourseInfo(){
        Scanner sc = new Scanner(System.in);
        String stringInput;
        int integerInput;
        System.out.print("Course Name: ");
        stringInput = sc.nextLine();
        setCourseName(stringInput);
        System.out.print("Number of Credit: ");
        integerInput = sc.nextInt();
        setCourseCredit(integerInput);
    }
    private void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    private void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getCourseCredit(){
        return courseCredit;
    }
}
