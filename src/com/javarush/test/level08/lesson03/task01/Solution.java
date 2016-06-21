package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> myH = new HashSet<String>();

        myH.add("арбуз");
        myH.add("банан");
        myH.add("вишня");
        myH.add("груша");
        myH.add("дыня");
        myH.add("ежевика");
        myH.add("жень-шень");
        myH.add("земляника");
        myH.add("ирис");
        myH.add("картофель");

        for (String s : myH){
            System.out.println(s);
        }
    }
}
// done