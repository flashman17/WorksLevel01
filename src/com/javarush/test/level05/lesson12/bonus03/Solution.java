package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String fN = reader.readLine();
        int n = Integer.parseInt(fN);

        String fK = reader.readLine();
        int k = Integer.parseInt(fK);
        int maximum=k;

        if (n>=2) {

            do {
                fK = reader.readLine();
                k = Integer.parseInt(fK);


                maximum = max(maximum, k);

                n--;
            } while (n >1);
        }


        System.out.println(maximum);
    }

    public static int max(int a, int b){
        return a > b ? a :b;
    }
}
//  решено