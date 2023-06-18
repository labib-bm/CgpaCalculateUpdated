package com.company;

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
        int number1,number,labPerformanceNumber;
        number1 = inputValidityChecker.getValidInput("Number of total class conducted: ");
        setNumberClass(number1);
        number = inputValidityChecker.getValidMarkInput("Number of total class attended: ",number1 );
        setNumberClassAttended(number);
        labPerformanceNumber = inputValidityChecker.getValidMarkInput("Lab Task-1 Mark (Max 25): ",25 );
        setLabTask1(labPerformanceNumber);
        labPerformanceNumber = inputValidityChecker.getValidMarkInput("Lab Task-2 Mark (Max 25): ",25 );
        setLabTask2(labPerformanceNumber);
        labPerformanceNumber = inputValidityChecker.getValidMarkInput("Lab Task-3 Mark (Max 25): ",25 );
        setLabTask3(labPerformanceNumber);
        labPerformanceNumber = inputValidityChecker.getValidMarkInput("Lab Task-4 Mark (Max 25): ",25 );
        setLabTask4(labPerformanceNumber);
        labPerformanceNumber = inputValidityChecker.getValidMarkInput("Lab Task-5 Mark (Max 25): ",25 );
        setLabTask5(labPerformanceNumber);
        number = inputValidityChecker.getValidMarkInput("Lab Project Mark (Max 25): ",25 );
        setLabProject(number);
        number = inputValidityChecker.getValidMarkInput("Lab Final Mark (Max 40): ",40 );
        setLabFinal(number);
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
