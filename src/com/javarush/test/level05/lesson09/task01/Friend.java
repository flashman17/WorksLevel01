package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    String name;
    int age;
    int sex;

    Friend(String name, int age, int sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    Friend(String name){
        this.name=name;

    }

    Friend(String name, int age){
        this.name=name;
        this.age=age;

    }

}

//решено