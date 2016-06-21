package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {


        int a1=1;
        int a2=2;
        int a3=3;
        int a4=4;
        int a5=5;
        int a6=6;
        int a7=7;
        int a8=8;
        int a9=9;
        int a10=10;

        int k = 1;
        while (k<11){
            System.out.println(a1*k + " " +a2*k + " " +a3*k + " " +a4*k + " " +a5*k + " " +a6*k + " " +a7*k + " " +a8*k + " " +a9*k + " " +a10*k);
            k++;
        }
    }
}
// решено