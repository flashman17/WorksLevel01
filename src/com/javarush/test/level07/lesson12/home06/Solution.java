package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human ("дед Василий", true, 88);
        Human ded2 = new Human ("дед Петро", true, 99);
        Human baba1 = new Human ("бабушка Валя", false, 66);
        Human baba2 = new Human ("бабушка Надя", false, 77);

        Human father = new Human ("папа Онуфрий", true, 55, ded1, baba1);
        Human mother = new Human ("мать Наталья", false, 44, ded2, baba2);

        Human baby1 = new Human ("сын Паша", false, 33, father, mother);
        Human baby2 = new Human ("дочь Рагулевна", false, 22, father, mother);
        Human baby3 = new Human ("дочь Ксюша", false, 11, father, mother);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(baby1);
        System.out.println(baby2);
        System.out.println(baby3);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String name, boolean sex, int age, Human father, Human mother)
        {
            this.name= name;
            this.sex=sex;
            this.age =age;
            this.father=father;
            this.mother=mother;
        }
        Human (String name, boolean sex, int age)
        {
            this.name= name;
            this.sex=sex;
            this.age =age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

    }

}
// done