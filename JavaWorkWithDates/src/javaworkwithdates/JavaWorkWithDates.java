package javaworkwithdates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class JavaWorkWithDates {

    public static void main(String[] args) 
    {
        //task11();
        //task12();
        task13();
        //task2();
        //task3();
    }
    
    public static void task11()
    {
        String str1 = "Регулярные выражения - не хухры мухры";
        String[] str2 = str1.split("\\s");
        System.out.println(Arrays.toString(str2));
        
        String str3 = "Слово +965 Сл0в0 -351 15Тест";
        System.out.println(str3.replaceAll("(-|\\+)?\\d+", "*NUMBER*"));
        System.out.println(str3.replaceFirst("(-|\\+)?\\d+", "*NUMBER*"));
    }
    
    public static void task12()
    {
        Date date = new Date();
        
        System.out.println(date.toString());
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2011-11-11";
        
        System.out.println("Строка " + str + " распаршена как ");
        Date parsingDate;
        
        try
        {
            parsingDate = ft.parse(str);
            System.out.println(parsingDate);
        }
        catch (ParseException e)
        {
            System.out.println("Не распаршена с помощью " + ft);
                    
        }              
        
    }
    
    public static void task13()
    {
        String months[] = {"Янв", "Фев", "Мар", "Апр", "Май", "Июн", "Июл", "Авг", "Сен", "Окт", "Ноя", "Дек"};
        
        int year;
        
        GregorianCalendar gcal = new GregorianCalendar();
        
        System.out.print("Дата: " + months[gcal.get(Calendar.MONTH)] + " " + gcal.get(Calendar.DATE) + " ");
        System.out.println(year = gcal.get(Calendar.YEAR));
        System.out.println("Время: " + gcal.get(Calendar.HOUR) + " : " + gcal.get(Calendar.MINUTE) + " : " + gcal.get(Calendar.SECOND));
        
        if(gcal.isLeapYear(year))
        {
            System.out.println(year + " - високосный");
        }
        else
        {
            System.out.println(year + " - не високосный");
        }
        
    }
    
    
    public static void task2()
    {
        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
        Date date = calendar.getTime();
        System.out.println(Person.toString(date));
    }
    
    public static void task3()
    {
        Scanner scn = new Scanner(System.in);
        
        int day, month, year, hour, minuts;
        
        System.out.println("Введите день");
        day = scn.nextInt();
        System.out.println("Введите месяц");
        month = scn.nextInt();
        System.out.println("Введите год");
        year = scn.nextInt();
        System.out.println("Введите час");
        hour = scn.nextInt();
        System.out.println("Введите минуты");
        minuts = scn.nextInt();
        
        Calendar calendar = new GregorianCalendar(year, month , day, hour, minuts);
        Date date = calendar.getTime();
        System.out.println(date);
    }
    
    
}
