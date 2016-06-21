package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, Date> reestr = new HashMap<String,Date>();
        reestr = createMap();
        removeAllSummerPeople(reestr);
        System.out.println(reestr);
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();

        for (int i=0; i<10; i++){
            String s = "Stallone"+i;
            Date date = new Date("JULY 2 1980");
            map.put(s, date);
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while(iter.hasNext())
        {
            Map.Entry<String, Date> pair = iter.next();
            Date value = pair.getValue();

            int d = value.getMonth();

            if ( (d>=5)&&(d<=7) ){
                iter.remove();
            }
        }
    }
}
// done