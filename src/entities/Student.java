package entities;

public class Student {

    public String name;
    public double firstQuarterGrade;
    public double secondQuarterGrade;
    public double thirdQuarterGrade;

    public double finalGrade() {
    return firstQuarterGrade + secondQuarterGrade + thirdQuarterGrade;
    }

    public double resultFinalGrade() {
        if (finalGrade() < 60.00) {
            return 60.00 - finalGrade();
        }else {
            return 0.00;
        }
    }
}


