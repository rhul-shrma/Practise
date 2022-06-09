package com.custClass;

class EmpDetails{
    int Salary;
    String Name;

    public int getSalary() {
        return Salary;
    }
    public void setSalary(int salary) {
        Salary = salary;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public void Display(){
        System.out.println("The Name of the Employee is: " + Name);
        System.out.println(" And the Salary of the Employee is: " + Salary);
    }
}


public class Employee {
    public static void main(String[] args) {
        EmpDetails empDetails1 = new EmpDetails();
        EmpDetails empDetails2 = new EmpDetails();

        empDetails1.Name = "Rahul";
        empDetails1.Salary = 30;

        empDetails2.Name = "Suraj";
        empDetails2.Salary = 35;

        empDetails1.Display();
        empDetails2.Display();
    }
}
