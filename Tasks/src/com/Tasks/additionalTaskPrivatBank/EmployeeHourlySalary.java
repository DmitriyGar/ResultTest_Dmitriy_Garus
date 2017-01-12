package com.Tasks.additionalTaskPrivatBank;

/**
 * класс описывающий работников с почасовой зарплатой
 */
public class EmployeeHourlySalary extends Employee{
    public double salary;

    public EmployeeHourlySalary(int id, String name, double salary) {
        super(id, name, salary);
        this.salary=salary*20.8*8;
    }

    @Override
    public double calcSalary() {
        return salary;
    }

    public String toString(){
        return id+" "+ getName() +" hourly payment "+" $"+calcSalary();
    }
}
