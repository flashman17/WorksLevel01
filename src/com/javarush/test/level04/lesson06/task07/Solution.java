package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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

        int a = Integer.parseInt(fA);
        int b = Integer.parseInt(fB);
        int c = Integer.parseInt(fC);

        if ( (a!=b) && (a!=c)  ){
            System.out.println("1");
        } else if ( (b!=c)&&(b!=a) ){
            System.out.println("2");
        } else if ( (c!=a)&&(c!=b) ) {
            System.out.println("3");
        }
    }
}
// решено