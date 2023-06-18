package com.company;

import java.util.Scanner;

public class labCourse {
    private int numberClassAttended = -1;
    private int numberClass = -1;
    private int labTask1 = -1;
    private int labTask2 = -1;
    private int labTask3 = -1;
    private int labTask4 = -1;
    private int labTask5 = -1;
    private int labProject = -1;
    private int labFinal = -1;
    public labCourse(){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Number of total class: ");
        number = sc.nextInt();
        setNumberClass(number);
        System.out.print("Number of total class attended: ");
        number = sc.nextInt();
        setNumberClassAttended(number);
        System.out.print("Lab Task 1: ");
        number = sc.nextInt();
        setLabTask1(number);
        System.out.print("Lab Task 2: ");
        number = sc.nextInt();
        setLabTask2(number);
        System.out.print("Lab Task 3: ");
        number = sc.nextInt();
        setLabTask3(number);
        System.out.print("Lab Task 4: ");
        number = sc.nextInt();
        setLabTask4(number);
        System.out.print("Lab Task 5: ");
        number = sc.nextInt();
        setLabTask5(number);
        System.out.print("Lab Project: ");
        number = sc.nextInt();
        setLabProject(number);
        System.out.print("Lab Final: ");
        number = sc.nextInt();
        setLabFinal(number);
        System.out.println(Math.ceil(getAttendance()));
        System.out.println(getLabPerformance());
        System.out.println(labProject);
        System.out.println(labFinal);
        System.out.println(getTotal());
    }
    private void setNumberClassAttended(int numberClassAttended){
        this.numberClassAttended = numberClassAttended;
    }
    private void setNumberClass(int numberClass){
        this.numberClass = numberClass;
    }
    private void setLabTask1(int labTask1){
        this.labTask1 = labTask1;
    }
    private void setLabTask2(int labTask2){
        this.labTask2 = labTask2;
    }
    private void setLabTask3(int labTask3){
        this.labTask3 = labTask3;
    }
    private void setLabTask4(int labTask4){
        this.labTask4 = labTask4;
    }
    private void setLabTask5(int labTask5){
        this.labTask5 = labTask5;
    }
    private void setLabProject(int labProject){
        this.labProject = labProject;
    }
    private void setLabFinal(int labFinal){
        this.labFinal = labFinal;
    }
    private float getAttendance(){
        return (float)(((float)this.numberClassAttended/(float)this.numberClass) * 10.0);
    }
    private float getLabPerformance(){
        return (float) ((this.labTask1+this.labTask2+this.labTask3+this.labTask4+this.labTask5)/5.0);
    }
    public int getTotal(){
        return  (int) ((Math.ceil(this.getAttendance())) + (Math.ceil(this.getLabPerformance()))+ this.labProject + this.labFinal);
    }
}
