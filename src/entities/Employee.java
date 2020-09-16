package entities;

public class Employee {

    public String name;
    public Double grossSalary;
    public Double tax;

    public double NetSalary()
    {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString(){
        return name
                + ", "
                + "$ "
                + NetSalary();
    }
}
