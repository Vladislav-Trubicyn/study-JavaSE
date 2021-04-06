package com.JavaWorkWithStrings;

import java.util.StringTokenizer;

public class JavaWorkWithStrings {

    public static void main(String[] args) 
    {
        task1();
        //task2();
        //task3();
        //task4();
        //task5();
    }
    
    private static void task1()
    {
        System.out.println("INSERT INTO GroupSelected VALUES ('Зевс','Четвериков',2,3);");
    }
    
    private static void task2()
    {
        Person pr1 = new Person("Vladislav","Trubicun","");
        System.out.println(pr1.getNSP());
        Person pr2 = new Person("Vladislav","","Vladimirovich");
        System.out.println(pr2.getNSP());
        
    }
    
    private static void task3()
    {
        String str1 = "Россия,Cамарская область,Жигулевск,Пушкина,Колотушкина,4,25а";
        Address adr1 = new Address(str1.split(","));
        adr1.outAll();
        
        String str2 = "Россия.Cамарская область.Жигулевск.Пушкина.Колотушкина.4.25а";
        
        StringTokenizer st = new StringTokenizer(str2, ".");        
        String[] podstr2 = new String[st.countTokens()];
        int i = 0;
        
        while(st.hasMoreElements())
        {            
            podstr2[i] = st.nextToken();
            i++;
        }
        
        Address adr2 = new Address(podstr2);
        adr2.outAll();
    }
    
    private static void task4()
    {
        Shirt[] shirts = new Shirt[11];
        
        shirts[0] = new Shirt("S001","Black Polo Shirt","Black","XL");
        shirts[1] = new Shirt("S002","Black Polo Shirt","Black","L");
        shirts[2] = new Shirt("S003","Blue Polo Shirt","Blue","XL");
        shirts[3] = new Shirt("S004","Blue Polo Shirt","Blue","M");
        shirts[4] = new Shirt("S005","Tan Polo Shirt","Tan","XL");
        shirts[5] = new Shirt("S006","Black T-Shirt","Black","XL");
        shirts[6] = new Shirt("S007","White T-Shirt","White","XL");
        shirts[7] = new Shirt("S008","White T-Shirt","White","L");
        shirts[8] = new Shirt("S009","Green T-Shirt","Green","S");
        shirts[9] = new Shirt("S010","Orange T-Shirt","Orange","S");
        shirts[10] = new Shirt("S011","Maroon Polo Shirt","Maroon","S");
        
        for(int i = 0; i < 11; i++)
        {
            System.out.println(shirts[i].toString());
        }
        
    }
    
    private static void task5()
    {
        System.out.println(PhoneNumber.convertNumber("89179787959"));
        System.out.println(PhoneNumber.convertNumber("+79179787959"));
        System.out.println(PhoneNumber.convertNumber("+19179787959"));
    }
    
}
