package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fA = reader.readLine();
        String fB = reader.readLine();

        int m = Integer.parseInt(fA);
        int n = Integer.parseInt(fB);

        for (int i=1; i<m+1; i++){
            int j=1;
            System.out.println("\n");
            for (j=1; j<n+1; j++){
                System.out.print("8");
            }
        }

    }
}
//решено