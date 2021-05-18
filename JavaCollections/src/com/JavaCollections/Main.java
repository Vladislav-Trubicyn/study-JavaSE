package com.JavaCollections;

import java.lang.reflect.Array;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //task1();
        //task2();
        task3();
        //task4();
    }

    public static void task1()
    {
        ArrayList arrList = new ArrayList();
        for(int i = 0; i < 10; i++)
        {
            arrList.add(null);
        }
        System.out.println("1 задание: Размер " + arrList.size());

        Integer[] array = {1,3,2,5,4,6,7,9,8,10};

        ArrayList<Integer> arrInt = new ArrayList<Integer>(Arrays.asList(array));

        System.out.println("---------------\n2 задание");

        System.out.println(arrInt);

        System.out.println("---------------\n3 задание: сортировка массива");

        Collections.sort(arrInt);

        System.out.println(arrInt);

        System.out.println("---------------\n4 задание: сортировка массива обратно");

        Collections.reverse(arrInt);

        System.out.println(arrInt);

        System.out.println("---------------\n5 задание: перемешивание массива");

        Collections.shuffle(arrInt);

        System.out.println(arrInt);

        System.out.println("---------------\n6 задание: циклический сдвиг на 1 элемент");

        Collections.rotate(arrInt, 1);

        System.out.println(arrInt);

        System.out.println("---------------\n7 задание: в списке только уникальные элементы");
        array = new Integer[]{1, 1, 3, 2, 5, 6, 2, 8, 9, 9};
        arrInt = new ArrayList<Integer>(Arrays.asList(array));

        Set<Integer> set = new LinkedHashSet<Integer>(arrInt);

        System.out.println(set);

        System.out.println("---------------\n9 задание: из списка получите массив ");

        Integer[] array2 = arrInt.toArray(new Integer[0]);

        for(Integer b: array2)
        {
            System.out.print(b);
        }

    }

    public static void task2()
    {
        PrimesGenerator pg = new PrimesGenerator(10);
        PrimesGenerator.PrimesGeneratorTest pgt = new PrimesGenerator.PrimesGeneratorTest();
        System.out.println("Числа в прямом порядке");
        pgt.getNaturalnumbers(5);
        System.out.println("Числа в обратном порядке");
        pgt.getReversNumbers(8);
    }

    public static void task3()
    {

    }

}
