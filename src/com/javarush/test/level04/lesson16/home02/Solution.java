package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fA = reader.readLine();
        String fB = reader.readLine();
        String fC = reader.readLine();


        int sA = Integer.parseInt(fA);
        int sB = Integer.parseInt(fB);
        int sC = Integer.parseInt(fC);

        if ( ((sA<sB) && (sB<sC)) || ((sA>sB) && (sB>sC)) ){
            System.out.println(sB);

        } else if ( (sB>sA)&&(sA>sC) || (sB<sA)&&(sA<sC) ){

            System.out.println(sA);
        } else if ( (sB>sC)&&(sC>sA) || (sB<sC)&&(sC<sA) ){

            System.out.println(sC);
        }

    }
}
// решено