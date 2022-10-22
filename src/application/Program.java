package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.firstQuarterGrade = sc.nextDouble();
        //System.out.println();
        student.secondQuarterGrade = sc.nextDouble();
        //System.out.println();
        student.thirdQuarterGrade = sc.nextDouble();

        System.out.printf("NOTA FINAL = %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.00) {
            System.out.println("FAILED");
            System.out.printf("FALTARAM %.2f PONTOS", student.resultFinalGrade());
        }

        sc.close();
    }
}
