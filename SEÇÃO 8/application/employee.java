package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class employee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //cria o objeto Employee
        Employee emp = new Employee();

        //fornece os dados do employee
        System.out.println("Name: ");
        emp.name = sc.next();
        System.out.println("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();
        System.out.println("Employee: " +  emp);

        //calcula o salario somado com o aumento
        System.out.println();
        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println("Updated data: " +  emp);
        sc.close();
    }
}
