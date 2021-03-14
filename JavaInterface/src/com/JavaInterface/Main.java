package com.JavaInterface;

import com.JavaInterface.Classes.*;

public class Main
{
    public static void main(String[] args)
    {
        //task1();
        //task2();
        task3();

    }

    public static void task1()
    {
        System.out.println("Кот");
        Cat cat = new Cat();
        cat.makeVoice();

        System.out.println("Собака");
        Dog dog = new Dog();
        dog.makeVoice();

        System.out.println("Корова");
        Cow cow = new Cow();
        cow.makeVoice();
    }

    public static void task2()
    {
        System.out.println("Кот");
        Cat cat = new Cat();
        cat.makeVoice();
        cat.woool();

        System.out.println("Ворона");
        Crow crow = new Crow();
        crow.makeVoice();
        crow.moveWings();
    }

    public static void task3()
    {
        GameStone gs = new GameStone(2,2);
        gs.start();
    }
}
