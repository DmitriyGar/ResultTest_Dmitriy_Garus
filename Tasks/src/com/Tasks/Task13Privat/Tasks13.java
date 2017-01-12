package com.Tasks.Task13Privat;

/**
 * Класс для задач 1-3 (PrivatBank):
 * - метод для преобразования символьной строки в целочисленное значение;
 * - метод вычисления факториала;
 * - метод удаления символа из строки.
 */
public class Tasks13 {


    public int getInt1(String str){  //метод1 для преобразования символьной строки в целочисленное значение;
        return  new Integer(str);
    }
    public int getInt2(String str){  //метод2 для преобразования символьной строки в целочисленное значение;
        int outStr=0,temp=0;
        int [] outArray=new int[str.length()];
        for (int i=0;i<str.length();i++) {
            temp = (int)str.charAt(i)-48;
            outArray[i]=temp;
            outStr += outArray[i]*Math.pow(10,outArray.length-i-1);
        }
        return  outStr;
    }

    public int factorial(int num){  //метод вычисления факториала;
        int result;
        if (num == 1)
            return 1;
        result = factorial(num - 1) * num;
        return result;
    }

    public String deleteSymbol(String str,int n){    //метод удаления символа из строки
        str=str.substring(0,n)+str.substring(n+1);
        return str;
    }
}
