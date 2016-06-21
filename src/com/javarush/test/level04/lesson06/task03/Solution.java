package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        int A = Integer.parseInt(fA);
        int B = Integer.parseInt(fB);
        int C = Integer.parseInt(fC);

        if ( (A>=B)&&(A>=C) ) {
            System.out.println(A);
            if (B>=C) {
                System.out.println(B);
                System.out.println(C);
            } else {System.out.println(C);
                System.out.println(B);}



        } else if ( (B>=A)&&(B>=C) ){
            System.out.println(B);
            if (A>=C) {
                System.out.println(A);
                System.out.println(C);
            } else {System.out.println(C);
                System.out.println(A);}


        } else if ( (C>=A)&&(C>=B) ){
            System.out.println(C);
            if (A>=B){
                System.out.println(A);
                System.out.println(B);
            } else {System.out.println(B);
                System.out.println(A);}
        }


    }
}
//решено