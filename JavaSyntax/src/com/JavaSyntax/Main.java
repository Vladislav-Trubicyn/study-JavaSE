package com.JavaSyntax;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //task2();
        //task3();
        //task4();
        //task5();
        task6();
    }

    public static void task2()
    {
        int a = 2, b = 5;

        //Вывод на экран
        System.out.println("Сложение чисел " + a + " и " + b + " = " + (a+b));
        System.out.println("Вычетание чисел " + a + " и " + b + " = " + (a-b));
        System.out.println("Умножение чисел " + a + " и " + b + " = " + (a*b));
        System.out.println("Деление чисел " + a + " и " + b + " = " + (a/b));
        System.out.println("Декремент чисел " + a + " и " + b + " = " + a-- + " " + b--);
        System.out.println("Инкремент чисел " + a + " и " + b + " = " + a++ + " " + b++);
    }

    public static void task3()
    {
        int a,b,c,sum,max;
        //Используем класс сканер для возможности получения введенных данных с консоли
        Scanner sc = new Scanner(System.in);

        //Вывод на экран
        System.out.println("Ведите 1 число");
        //Получение данных с консоли
        a = sc.nextInt();
        System.out.println("Ведите 2 число");
        b = sc.nextInt();
        System.out.println("Ведите 3 число");
        c = sc.nextInt();

        max = a;
        if(max < b)
        {
            max = b;
        }
        if(max < c)
        {
            max = c;
        }
        sum = (a + b + c) / 3;

        System.out.println("Максимальное из веденных чисел - " + max);
        System.out.println("Среднеарифметическое чисел - " + sum);
    }

    public static void task4()
    {
        //Объявляем массив
        int[] array = new int[100];
        int count = 0;

        //Используем класс рандом для случайных чисел
        Random rnd = new Random();

        //Заполняем масив случайными числами от 0 до 100
        for(int i = 0; i < 100; i++)
        {
            array[i] = rnd.nextInt(100);
        }

        //Выводим на экран
        for(int elem: array)
        {
            //Передается тру если число простое
            if(isSimple(elem) == true)
            {
                System.out.print(elem + ",");
                //Если число кратно 3 то считаем его
                if(elem % 3 == 0)
                {
                    count++;
                }
            }


        }

        System.out.println("\nКоличество чисел кратны 3 = " + count + " шт.");
    }

    public static void task5()
    {
        int x1 = 0, x2 = 1, n, sum_fib;

        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        for(int i = 0; i < n; i++)
        {
            sum_fib = x1 + x2;
            x1 = x2;
            x2 = sum_fib;
            System.out.print(sum_fib + " ");
        }
    }

    public static void task6()
    {
        for (int n = 0; n < 5; n++)
        {
            //первое значение треугольника
            int Cnk = 1;
            System.out.print(Cnk);

            //Находим остальные строки треугольника
            for (int k = 1; k <= n; k++)
            {
                Cnk *= (n - k + 1);
                Cnk /= k;
                System.out.print(" "); System.out.print(Cnk);
            }
            System.out.println();
        }
    }

    //Метод, который определяет, является ли число простым или нет
    public static boolean isSimple(int value)
    //а также, возвращающая логический ответ
    {
        for(int i = 2; i < value; i++)  //бежим по циклу начиная от 2 и до самого числа не включительно
        {
            if(value % i == 0)  //если остаток от деления числа на значение шага цикла равен нулю, то
            {
                return false;  //вернуть false, переданное число простым не является
            }
        }
        //если же ни одного значения, удоволетворяющего условию выше, не было найдено, то
        return true;  //вернуть true, переданное число простое
    }

}
