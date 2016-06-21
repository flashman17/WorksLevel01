package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
+ Имя, +
+ Имя, вес, возраст +
+ Имя, возраст (вес стандартный)+
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{

    String name;
    int age;
    int weight;
    String color;
    String adress;

    Cat(int weight, String color, String adress) {
        this.weight = weight;
        this.color=color;
        this.adress="alien home";
        this.age=10;

    }


    Cat(String name){
        this.name = name;
        this.age=10;
        this.weight=10;
    }

    Cat(String name, int weight, int age){
        this.name = name;
        this.age=age;
        this.weight=weight;
    }

    Cat(String name, int age){
        this.name = name;
        this.age=age;
        this.weight=10;
    }
    Cat(int weight, String color) {
        this.weight = weight;
        this.color=color;
        this.adress="homeless";

    }


}
// решено