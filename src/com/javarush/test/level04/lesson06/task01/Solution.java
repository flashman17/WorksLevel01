package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fA = reader.readLine();
        String fB = reader.readLine();

        int sA = Integer.parseInt(fA);
        int sB = Integer.parseInt(fB);

        if (sA > sB){
            System.out.println(sB);
        } else System.out.println(sA);

    }
}
//решено