package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summ=0;
        String s="сумма";

        String rVvoda=null;
        do{

        rVvoda = reader.readLine();
        if (s.equals(rVvoda)!=true){

            int x = Integer.parseInt(rVvoda);
            summ = summ + x;}
            else {break;}




        } while (rVvoda.equals(s)==false);
        System.out.println(summ);


    }
}
// решено