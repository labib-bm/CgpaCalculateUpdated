package com.company;
import java.util.Scanner;

public class studentInfo {
    private String studentName = null;
    private String studentID = null;
    private int studentBatch = -1;
    private String studentSection = null;
    private String studentSemester = null;
    public studentInfo(){

    }
    public void setStudentInformation(){
        Scanner sc = new Scanner(System.in);
        String stringInput;
        int integerInput;
        System.out.print("Student Name: ");
        stringInput = sc.nextLine();
        setStudentName(stringInput);
        System.out.print("Student ID (XXX-XX-XXXXX): ");
        stringInput = sc.nextLine();
        setStudentID(stringInput);
        integerInput = inputValidityChecker.getValidInput("Student Batch No: ");
        setStudentBatch(integerInput);
        System.out.print("Student Section: ");
        stringInput = sc.nextLine();
        setStudentSection(stringInput);
        System.out.print("Student Semester: ");
        stringInput = sc.nextLine();
        setStudentSemester(stringInput);
    }
    private void setStudentName(String studentName){
        this.studentName = studentName;
    }
    private void setStudentID(String studentID){
        this.studentID = studentID;
    }
    private void setStudentBatch(int studentBatch){
        this.studentBatch = studentBatch;
    }
    private void setStudentSection(String studentSection){
        this.studentSection = studentSection;
    }
    private void setStudentSemester(String studentSemester){
        this.studentSemester = studentSemester;
    }
    public void getStudentInformation(){
        System.out.println("Student Info");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("      Program               B.Sc. in Computer Science & Engineering");
        System.out.println("      Name of Student       "+getStudentName());
        System.out.println("      Student ID            "+getStudentID());
        System.out.println("      Batch                 "+ getStudentBatch());
        System.out.println("      Student Section:      "+ getStudentSection());
        System.out.println("      Academic Result of :  "+getStudentSemester()+"\n\n");
    }
    private String getStudentName(){
        return studentName;
    }
    private String getStudentID(){
        return studentID;
    }
    private int getStudentBatch(){
        return studentBatch;
    }
    private String getStudentSection(){
        return studentSection;
    }
    private String getStudentSemester(){
        return studentSemester;
    }
}
