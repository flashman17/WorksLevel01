package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] myArray = new int[5];

        myArray[0] = Integer.parseInt(reader.readLine());
        myArray[1] = Integer.parseInt(reader.readLine());
        myArray[2] = Integer.parseInt(reader.readLine());
        myArray[3] = Integer.parseInt(reader.readLine());
        myArray[4] = Integer.parseInt(reader.readLine());

        for (int i =0; i < 4; i++){

            boolean per = false;

            for (int j =0; j < 4; j++){

                if (myArray[j] > myArray[j+1]) {

                    int temp;
                    temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = temp;
                    per = true;
                }
            }
            if (!per) break;
        }

        for (int i=0; i <5; i++){
            System.out.println(myArray[i]);
        }
    }
} // решено
