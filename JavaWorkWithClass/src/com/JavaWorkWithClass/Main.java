package com.JavaWorkWithClass;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //task2(10);
        //task3();
        //task5();
        //task6();
        //task7(2);
        task8();

    }

    public static void task2(int count)
    {
        Fibonachi fb = new Fibonachi();

        System.out.println("Массив чисел Фибоначчи");
        for(int b: fb.getArray(count))
        {
            System.out.println(b);
        }
    }

    public static void task3()
    {
        TrianglPaskal tp = new TrianglPaskal();
        tp.drawTriangl();
    }

    public static void task5()
    {
        Bicycle bmx = new Bicycle("BMX", 120);
        Bicycle.SteeringWheel wheel = bmx.new SteeringWheel();
        Bicycle.Seat seat = bmx.new Seat();

        seat.up();
        bmx.start();
        wheel.left();
        wheel.right();
    }

    public static void task6()
    {
        GameStone gs = new GameStone(2,2);
        gs.start();

    }

    public static void task7(int countHumans)
    {
        int input = 0;

        Human[] hm = new Human[countHumans];

        Scanner scn = new Scanner(System.in);

        //Заполнение объектов человеков
        for(byte i = 0; i < countHumans; i++)
        {
            hm[i] = new Human();
            System.out.println("Введите фамилию человека");
            hm[i].setSurname(scn.nextLine());
            System.out.println("Введите адрес человека");
            hm[i].setAdress(scn.nextLine());
            System.out.println("Введите день рождения человека (пример ggggmmdd)");
            hm[i].setDate(scn.nextInt());
            scn.nextLine();
        }

        while(input != 7)
        {
            System.out.println("\nВыберите действие\n1 - найти человека по фамилии\n2 - поиск человека по адресу\n" +
                    "3 - поиск людей родившиеся между датами\n4 - найти самого старшего и молодого\n5 - найти людей проживающих на одной улице\n6 - выход");
            input = scn.nextInt();
            scn.nextLine();

            String result = "";

            switch(input)
            {
                case 1:
                    System.out.println("Введите искомую фамилию");
                    String name = scn.nextLine();

                    for(int i = 0; i < countHumans; i++)
                    {
                        if(hm[i].getSurname().indexOf(name) != -1)
                        {
                            result = "Человек с фамилией " + name + " найден";
                            break;
                        }
                        else
                        {
                            result = "Человек с фамилией " + name + " не найден";
                        }
                    }
                    System.out.println(result);
                    input = 0;
                    ;break;

                case 2:
                    System.out.println("Введите искомый адрес");
                    String adress = scn.nextLine();

                    for(int i = 0; i < countHumans; i++)
                    {
                        if(hm[i].getAdress().indexOf(adress) != -1)
                        {
                            result = "Человек с схожим адресом " + adress + " найден";
                            break;
                        }
                        else
                        {
                            result = "Человек с схожим адресом " + adress + " не найден";
                        }
                    }

                    System.out.println(result);
                    input = 0;
                    ;break;

                case 3:
                    System.out.println("Введите период даты с (пример ggggmmdd)");
                    int date1 = scn.nextInt();
                    System.out.println("Введите период даты по (пример ggggmmdd)");
                    int date2 = scn.nextInt();

                    for(int i = 0; i < countHumans; i++)
                    {
                        if(hm[i].getDate() >= date1 && hm[i].getDate() <= date2)
                        {
                            result += "Человек " + hm[i].getSurname() + " входит в данный период\n";
                        }
                    }

                    System.out.println(result);
                    input = 0;
                    ;break;

                case 4:
                    int[] maxAge = new int[2], minAge = new int[2];

                    maxAge[0] = hm[0].getDate();
                    minAge[0] = maxAge[0];

                    for(int i = 0; i < countHumans; i++)
                    {
                        if(minAge[0] > hm[i].getDate())
                        {
                            minAge[0] = hm[i].getDate();
                            minAge[1] = i;
                        }
                        if(maxAge[0] < hm[i].getDate())
                        {
                            maxAge[0] = hm[i].getDate();
                            maxAge[1] = i;
                        }
                    }

                    System.out.println("Самый старший " + hm[maxAge[1]].getSurname() + " его дата рождения " + maxAge[0] +
                            "\nСамый младший " + hm[minAge[1]].getSurname() + " его дата рождения " + minAge[0]);
                    input = 0;
                    ;break;

                case 5:
                    System.out.println("Введите назание улицы");
                    String nameStreet = scn.nextLine();

                    for(int i = 0; i < countHumans; i++)
                    {
                        if(hm[i].getAdress().indexOf(nameStreet) != -1)
                        {
                            result += "Человек " + hm[i].getSurname() + " проживает на данной улице\n";
                        }
                    }

                    System.out.println(result);
                    input = 0;
                    ;break;

                case 6: input = 7
                    ;break;
            }
       }

    }

    public static void task8()
    {

    }
}
