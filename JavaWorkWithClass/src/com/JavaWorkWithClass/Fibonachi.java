package com.JavaWorkWithClass;

import java.util.Scanner;

public final class Fibonachi
{
    //Первые значения чисел фибоначчи
    private int x1 = 0, x2 = 1, sum_fib;
    private int[] array;

    public int[] getArray(int n)
    {
        array = new int[n];

        for(int i = 0; i < n; i++)
        {
            sum_fib = x1 + x2;
            x1 = x2;
            x2 = sum_fib;
            array[i] = sum_fib;
        }

        return array;
    }

}
