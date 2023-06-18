package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Portal");
        System.out.println("Collect Student Info");
        studentInfo Labib = new studentInfo();
        Labib.setStudentInformation();
        System.out.print("Number of Course: ");
        int courseNumber = sc.nextInt();
        courseInfo course = new courseInfo();
        String[] courseName = new String[courseNumber];
        int[] courseCredit = new int[courseNumber];
        int[] courseObtainedNumber = new int[courseNumber];
        double[] courseObtainedGradePoint = new double[courseNumber];
        String[] courseObtainedGrade = new String[courseNumber];
        for(int i=0;i<courseNumber;i++){
            course.setCourseInfo();
            courseName[i] = course.getCourseName();
            courseCredit[i] = course.getCourseCredit();
            if(courseCredit[i]==3){
                theoryCourse theory = new theoryCourse();
                courseObtainedNumber[i] = theory.getTotal();
            }
            else if(courseCredit[i]==1){
                labCourse lab = new labCourse();
                courseObtainedNumber[i] = lab.getTotal();
            }
        }
        countSubjectCGPA count = new countSubjectCGPA();
        Labib.getStudentInformation();
        System.out.println("Courses List:");
        int totalCredit = 0;
        double totalCreditPoint = 0;
        for(int i=0;i<courseNumber;i++){
            totalCredit+=courseCredit[i];
//            System.out.println("Course " + i+1 + " Name: " + courseName[i]);
//            System.out.println("Number of Credit: " + courseCredit[i]);
//            System.out.println("Number obtained: " + courseObtainedNumber[i]);
            courseObtainedGradePoint[i] = count.returnLetterGradePoint(courseObtainedNumber[i]);
            totalCreditPoint+=courseCredit[i]*courseObtainedGradePoint[i];
//            System.out.println("Obtained Grade Point: " + courseObtainedGradePoint[i]);
            courseObtainedGrade[i] = count.returnLetterGrade(courseObtainedGradePoint[i]);
//            System.out.println("Obtained Grade: " + courseObtainedGrade[i]);
            System.out.println(courseName[i]+"   "+"    Cr: "+courseCredit[i]+"    GPA: "+courseObtainedGradePoint[i]+"    "+courseObtainedGrade[i]);
        }
        double finalCGPA = totalCreditPoint/totalCredit;
        String formatNumber = String.format("%.2f", finalCGPA);
        System.out.println("Total Credit Requirement:0  Total Credits Taken : "+totalCredit+     "    SGPA : "+formatNumber);

    }
}
