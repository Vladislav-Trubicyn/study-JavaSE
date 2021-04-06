package com.JavaWorkWithStrings;

public class Shirt 
{
    private String id;
    private String description;
    private String color;
    private String size;
    
    public Shirt(String id, String desc, String color, String size)
    {
        this.id = id;
        this.description = desc;
        this.color = color; 
        this.size = size;
    }
    
    public String toString()
    {
        return "Id - " + id + " Описание - " + description + " Цвет - " + color + " Размер - " + size;
    }
}
