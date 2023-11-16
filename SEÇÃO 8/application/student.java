package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class student {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student std = new Student();

        System.out.println("Nome: ");
        std.name = sc.next();
        System.out.println("Nota 1: ");
        std.grade1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        std.grade2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        std.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + std.finalGrade());
        System.out.println(std.result());

        sc.close();
    }
}
