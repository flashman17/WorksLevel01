package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        int a[] = new int[3] ;
        a[0] = Integer.parseInt(fA);
        a[1] = Integer.parseInt(fB);
        a[2] = Integer.parseInt(fC);

        int b=0;
        int c=0;

        for (int i=0; i<3; i++){

            if (a[i] < 0) {
                b++;
            } else if (a[i]>0){
                c++;
            }
        }
        System.out.println("количество отрицательных чисел: " +b);
        System.out.println("количество положительных чисел: " +c);

    }
}
// решено