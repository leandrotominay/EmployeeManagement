package application;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     // Leitor de dados de funcionario
     // Github leandrotominay

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Employee details: ");
        System.out.println("Name: ");
        emp.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);
        System.out.println();
        System.out.println("Employee: " + emp);
        sc.close();

    }
}
