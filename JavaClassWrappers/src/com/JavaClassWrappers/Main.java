package com.JavaClassWrappers;

public class Main
{
    public static void main(String[] args)
    {
        int i = 0;
        byte[] a = {1,2,3,4,5,6,7,8,10};
        Byte[] a1 = new Byte[a.length];
        Integer[] a2 = new Integer[a.length];

        for(byte b: a)
        {
            a1[i++] = b;
        }
        i = 0;

        System.out.println("Конвертация byte[] в Byte[] ");
        for(Byte b: a1)
        {
            System.out.println(b);
        }


//        for(Integer b: a1)
//        {
//            a2[i++] = b;
//        }
    }
}
