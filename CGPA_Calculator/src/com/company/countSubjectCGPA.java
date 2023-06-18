package com.company;

public class countSubjectCGPA {
    private int numberObtained = 0;
    private double obtainedGrade = 0.0;
    public countSubjectCGPA(){
    }
    public double returnLetterGradePoint(int numberObtained){
        this.numberObtained =numberObtained;
        if(numberObtained<40){
            this.obtainedGrade = 0.0;
            return this.obtainedGrade;
        }
        else if(numberObtained<45){
            this.obtainedGrade = 2.0;
            return this.obtainedGrade;
        }
        else if(numberObtained<50){
            this.obtainedGrade = 2.25;
            return this.obtainedGrade;
        }
        else if(numberObtained<55){
            this.obtainedGrade = 2.5;
            return this.obtainedGrade;
        }
        else if(numberObtained<60){
            this.obtainedGrade = 2.75;
            return this.obtainedGrade;
        }
        else if(numberObtained<65){
            this.obtainedGrade = 3.0;
            return this.obtainedGrade;
        }
        else if(numberObtained<70){
            this.obtainedGrade = 3.25;
            return this.obtainedGrade;
        }
        else if(numberObtained<75){
            this.obtainedGrade = 3.50;
            return this.obtainedGrade;
        }
        else if(numberObtained<80){
            this.obtainedGrade = 3.75;
            return this.obtainedGrade;
        }
        else
            this.obtainedGrade = 4.0;
        return this.obtainedGrade;
    }
    public String returnLetterGrade(double obtainedGrade){
        switch ((int)(this.obtainedGrade*100)){
            case 400:
                return "A+";
            case 375:
                return "A";
            case 350:
                return "A-";
            case 325:
                return "B+";
            case 300:
                return "B";
            case 275:
                return "B-";
            case 250:
                return "C+";
            case 225:
                return "C";
            case 200:
                return "D";
            default:
                return "F";
        }
    }
}
