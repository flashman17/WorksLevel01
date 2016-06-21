package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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

        int[] workArray = new int[3];

        workArray[0] = Integer.parseInt(fA);
        workArray[1] = Integer.parseInt(fB);
        workArray[2]= Integer.parseInt(fC);

        int number = 0;

        for (int i=0; i<3; i++){
            if (workArray[i] >0) {
                number++;
            }
        }

        System.out.println(number);
    }
}

//решено