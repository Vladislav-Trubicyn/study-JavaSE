package com.JavaCollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrimesGenerator
{
    private static int n;

    public PrimesGenerator(int n)
    {
        this.n = n;
    }

    public static int[] Generate()
    {
        int[] array = new int[n];

        for(int i = 0; i < n; i++)
        {
            array[i] = i;
        }

        return  array;
    }

    public static class PrimesGeneratorTest
    {
        public void getNaturalnumbers(int n)
        {
            Integer[] array = Arrays.stream(Generate()).boxed().toArray(Integer[]::new);

            ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(array));

            for(int i = 0; i < n; i++)
            {
                System.out.println(arrList.get(i));
            }
        }

        public void getReversNumbers(int n)
        {
            Integer[] array = Arrays.stream(Generate()).boxed().toArray(Integer[]::new);

            ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(array));

            Collections.reverse(arrList);

            for(int i = 0; i < n; i++)
            {
                System.out.println(arrList.get(i));
            }
        }
    }

}
