package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
        this.name=name;
          age=3;
       weight=3;
         color="Black";
    }

    public Cat(String name,int weight, int age){
        this.name=name;
        this.age=age;
       this.weight=weight;
        color="Black";
    }

    public Cat(String name,  int age){
        this.name=name;
        this.age=age;
        weight=3;
        color="Black";
    }
    public Cat( int weight, String color){
        age=3;
        this.weight=weight;
        this.color=color;
    }

    public Cat(int weight,String color,String address){
        age=3;
        this.weight=weight;
        this.address=address;
        this.color=color;
    }




    public static void main(String[] args) {

    }
}
