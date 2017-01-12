package com.Tasks.additionalTaskPrivatBank;

/**
 * Базовый класс работников
 */
public abstract class Employee {
    private double salary;
    private String name;
    public int id;
    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return id+" "+ getName() +" "+" $"+ getSalary();
    }
   public abstract double calcSalary();

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

}
