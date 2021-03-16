package com.JavaObject;

public class Main
{
    public static void main(String[] args)
    {
        ExtClass ec1 = new ExtClass((byte)1,2,3,"4");
        ExtClass ec2 = new ExtClass((byte)1,2,3,"4");

        System.out.println("Одинаковы ли объекты " + ec1.equals(ec2));
        System.out.println("Хэш сумма первого объекта " + ec1.hashCode() + " вторго объекта " + ec2.hashCode());
        System.out.println("Конверn в строку " + ec1.toString());
    }

}
