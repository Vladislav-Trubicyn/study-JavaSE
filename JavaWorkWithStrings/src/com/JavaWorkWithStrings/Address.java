package com.JavaWorkWithStrings;

public class Address 
{
    private String country, region, city, street, house, housing, flat;
    
    public Address (String[] str)
    {         
        this.country = str[0];
        this.region = str[1];
        this.city = str[2];
        this.street = str[3];
        this.house = str[4];
        this.housing = str[5];
        this.flat = str[6];
    }
    
    public void outAll()
    {
        System.out.println(country + region + city + street + house + housing + flat);
    }
    
}
