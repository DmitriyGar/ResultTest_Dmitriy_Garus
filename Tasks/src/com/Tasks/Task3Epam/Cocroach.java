package com.Tasks.Task3Epam;

/**
 * Многопоточный класс Cocroach.
 */
import com.Tasks.RunTasks;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cocroach implements Runnable{
    public int number;
    int time;
    public int speed;
    public Thread  t;
    Cocroach(){
        t= new Thread(this);
        t.start();
    }
    //метод goCocroach получает номер таракана, скорость и расстояние. Возвращает время прохождения дистанции.
    public int goCocroach(int number, int speed, int distance){
        this.speed=speed;
        this.number=number;
        time=distance/speed*10;
        this.time=time;
        return time;
    }

    @Override
    public void run() {
        //Задержка потока, зависящая от времени прохождения таракана дистанции
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(RunTasks.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Вывод результатов
        System.out.println(" Cocroach #"+number+" run 500 sm (Speed="+speed+"sm/s  Time="+(int)time/10+"s) ");
    }

}
