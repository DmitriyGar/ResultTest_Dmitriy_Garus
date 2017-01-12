package com.Tasks.additionalTaskPrivatBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Класс обрабатывает классы сотрудников, сортирует список, сохраняет данные в файл
 */
public class RunEmployee {
    Scanner scanner;
   public RunEmployee() {
        //запуск расчета среднемесячной зароботной платы сотрудников
        // а) ввод данных в List и сортировка по зарплате и имени через comparator
        Set<Employee> EmployeeList = new TreeSet<Employee>(new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                double diff = a.calcSalary() - b.calcSalary();
                if (diff > 0.0)
                    return -1;
                else if (diff < 0.0)
                    return 1;
                else {
                    int n = a.getName().compareTo(b.getName());
                    return (n == 0) ? 1 : n;
                }
            }
        });
        EmployeeList.add(new EmployeeFixedSalary(1, "Ivan", 1900));
        EmployeeList.add(new EmployeeFixedSalary(2, "Masha", 755));
        EmployeeList.add(new EmployeeHourlySalary(3, "Dmitriy", 10));
        EmployeeList.add(new EmployeeHourlySalary(4, "Andrey", 8.5));
        EmployeeList.add(new EmployeeFixedSalary(5, "Victor", 1000));
        EmployeeList.add(new EmployeeHourlySalary(6, "Maxim", 15));
        EmployeeList.add(new EmployeeHourlySalary(7, "Viktoriya", 7.3));
        EmployeeList.add(new EmployeeFixedSalary(8, "Alexander", 1900));
        //запись сортированных данных в список
        ArrayList sortedlist = new ArrayList();
        sortedlist.addAll(EmployeeList);
        // d) запись коллекции сортированных данных в файл dbEmployee.dat
        try {
            FileWriter writer = new FileWriter("src\\com\\Tasks\\additionalTaskPrivatBank\\dbEmployee.dat", false);
            for (int i = 0; i < EmployeeList.size(); i++) {
                writer.write(String.valueOf(sortedlist.get(i)));
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        ArrayList NameList = new ArrayList();
        ArrayList IdList = new ArrayList();
        // d) чтение сортированных данных из файла dbEmployee.dat
        try {
            scanner = new Scanner(new File("src\\com\\Tasks\\additionalTaskPrivatBank\\dbEmployee.dat"));
            scanner.useLocale(Locale.US);
            int c = 0;
            while (scanner.hasNextLine()) {
                IdList.add(scanner.next());
                NameList.add(scanner.next());
                scanner.next();
                scanner.next();
                scanner.next();
                c++;
                if (!scanner.hasNextDouble()) {
                    break;
                }
            }
            for (int i = 0; i < NameList.size(); i++) {
                if (i < 5)
                    System.out.println(NameList.get(i)); // b) вывод первых 5 имен из полученного списка
                else if (i >= 5)
                    System.out.println(IdList.get(i));   // с) вывод последних 3 идентификатора работников из полученного списка
            }
        } catch (FileNotFoundException e) { //обработка исключения при открытии файла
            e.printStackTrace();
            System.err.println("Файл не найден!!!");
        } finally {
            scanner.close();
        }
    }
}
