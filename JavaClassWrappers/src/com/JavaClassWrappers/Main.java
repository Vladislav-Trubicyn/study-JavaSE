package com.JavaClassWrappers;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        task1();

    }

    public static void task1()
    {
        int i = 0;
        byte[] a = {1,2,3,4,5,6,7,8,10};
        Byte[] a1 = new Byte[a.length];
        Integer[] a2 = new Integer[a.length];
        int[] a3 = new int[a.length];
        String a4 = new String();

        System.out.println("Конвертация byte[] в Byte[] ");
        //Через цикл заполняем массив обертки Byte
        for(byte b: a)
        {
            a1[i++] = b;
        }
        i = 0;
        //Вывод
        for(Byte b: a1)
        {
            System.out.println(b);
        }

        System.out.println("Конвертация Byte[] в Integer[] ");
        for(Byte b: a1)
        {
            //Используем метод valueOf для преобразоания Byte в Integer
            a2[i++] = Integer.valueOf((Byte)b);
        }
        i = 0;

        for(Integer b: a2)
        {
            System.out.println(b);
        }

        System.out.println("Конвертация Integer[] в int[] ");
        for(int b: a2)
        {
            a3[i++] = b;
        }
        i = 0;

        for(int b: a3)
        {
            System.out.println(b);
        }

        //или исползовать более короткий вариант
        //int[] a3 = Arrays.stream(a2).mapToInt(Integer::intValue).toArray();

        System.out.println("Конвертация Integer[] в String ");

        //преобразуем массив int в стринг
        a4 = Arrays.toString(a3);

        System.out.println(a4);
    }

}
