package com.Tasks.Task3Epam;

/**
 * Класс проверки забегов тараканов
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Judge {
    String win;
    public Judge(){
    }
    public void go (int n) throws InterruptedException{
        String finishTime;
        ArrayList<Integer> result=new ArrayList();
        Set resultTime=new TreeSet();
        for (int i=1;i<=n;i++){
            Cocroach c=new Cocroach();
            finishTime=""+c.goCocroach(i, (int)(Math.random()*100) , 500);
            resultTime.add((int)(Integer.parseInt(finishTime)/10));

        }
        result.addAll(resultTime);


    }



}
