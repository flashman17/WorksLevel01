package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> myStr = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++){
            myStr.add(i, reader.readLine());
        }

        int j=13;

        while (j>0){
            String temp = myStr.get(4);
            myStr.remove(4);
            myStr.add(0, temp);
            j--;

        }
        for (int i=0; i<5; i++){
            System.out.println(myStr.get(i));
        }

    }
}
// done