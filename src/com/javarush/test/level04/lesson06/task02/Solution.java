package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fA = reader.readLine();
        String fB = reader.readLine();
        String fC = reader.readLine();
        String fD = reader.readLine();

        int sA = Integer.parseInt(fA);
        int sB = Integer.parseInt(fB);
        int sC = Integer.parseInt(fC);
        int sD = Integer.parseInt(fD);

        if ( (sA>=sB) && (sA>=sC) && (sA>=sD) ){
            System.out.println(sA);
        } else if ( (sB>=sA) && (sB>=sC) && (sB>=sD) ){
            System.out.println(sB);
        } else if ( (sC>=sA) && (sC>=sB) && (sC>=sD) ){
            System.out.println(sC);
        } else if ( (sD>=sA) && (sD>=sB) && (sD>=sC) ){
            System.out.println(sD);
        }

    }
}
// решено