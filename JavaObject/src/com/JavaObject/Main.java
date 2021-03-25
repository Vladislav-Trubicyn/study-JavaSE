package com.JavaObject;

public class Main
{
    public static void main(String[] args)
    {
        ExtClass ec1 = new ExtClass((byte)1,2,3,"4");
        ExtClass ec2 = new ExtClass((byte)1,2,3,"4");
        
        System.out.println("\nОдинаковы ли объекты " + ec1.equals(ec2));
        System.out.println("Хэш сумма первого объекта " + ec1.hashCode() + " вторго объекта " + ec2.hashCode());
        System.out.println("Конверn в строку " + ec1.toString());
        
        PhoneNumber pn1 = new PhoneNumber(8,800,5545);
        PhoneNumber pn2 = new PhoneNumber(8,800,5535);
        
        System.out.println("\nОдинаковы ли номера " + pn1.equals(pn2));
        System.out.println("Хэш сумма первого номера " + pn1.hashCode() + " вторго номера " + pn2.hashCode());
        System.out.println("Конверт в строку первый номер " + pn1.toString() + " второй номер " + pn2.toString());        
        
        Fibonachichi fb1 = new Fibonachichi(5);
        Fibonachichi fb2 = new Fibonachichi(10);
        
        System.out.println("\nОдинаковы ли объекты " + fb1.equals(fb2));
        System.out.println("Хэш сумма первого объекта " + fb1.hashCode() + " вторго объекта " + fb2.hashCode());
        System.out.println("Конверт в строку первый объекта " + fb1.toString() + " второй объекты " + fb2.toString());
        
        Triangle tg1 = new Triangle(10);
        Triangle tg2 = new Triangle(15);
        
        System.out.println("\nОдинаковы ли объекты " + tg1.equals(tg2));
        System.out.println("Хэш сумма первого объекта " + tg1.hashCode() + " вторго объекта " + tg2.hashCode());
        System.out.println("Конверт в строку первый объекта " + tg1.toString() + " второй объекты " + tg2.toString());
    }

}
