package com.Tasks.additionalTaskPrivatBank;

/**
 * Класс описывающий работников с фиксированной зарплатой
 */
public class EmployeeFixedSalary extends Employee{
    public double salary;

    public EmployeeFixedSalary(int id, String name, double salary) {
        super(id, name, salary);
        this.salary=salary;
    }

    @Override
    public double calcSalary() {
        return salary;
    }

    public String toString(){
        return id+" "+ getName() +" fixed payment "+" $"+calcSalary();
    }
    }
