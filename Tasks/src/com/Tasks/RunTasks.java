package com.Tasks;

import com.Tasks.Task13Privat.Tasks13;
import com.Tasks.Task1Epam.TCPClient;
import com.Tasks.Task1Epam.TCPServer;
import com.Tasks.Task3Epam.Judge;
import com.Tasks.additionalTaskPrivatBank.RunEmployee;

import java.io.IOException;

/**
        * Класс для проверки задач 1-3 и дополнительной задачи (privatbank):
        *
        */
public class RunTasks {
    static int n;
    public static void main(String[] args) throws IOException, InterruptedException {

        //проверка методов задач 1-3
        Tasks13 tasks13 =new Tasks13();
        n=4;
        System.out.println("Tasks 1-3(Privat):");
        System.out.println("Test1-v1 -> String str=1256, int="+ tasks13.getInt1("1256"));
        System.out.println("Test1-v2 -> String str=1256, int="+ tasks13.getInt2("1256"));
        System.out.println("Test2 -> Factorial of number "+n+" = " + tasks13.factorial(n));
        System.out.println("Test3 -> "+ tasks13.deleteSymbol("Combinations",n));

        //проверка работы классов со списком сотрудников
        System.out.println('\n'+"Additional task(Privat)");
        RunEmployee runEmployee=new RunEmployee();

        // Task3Epam проверка классов тараканьи бега
        System.out.println('\n'+"Tasks 3(Epam):");
        Judge j=new Judge();
        j.go(5);

        //Task1Epam проверка класса сервера UDP
        //System.out.println('\n'+"Tasks 1(Epam):");
        TCPServer tcp=new TCPServer();

    }
}
