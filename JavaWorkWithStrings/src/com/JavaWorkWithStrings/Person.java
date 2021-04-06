package com.JavaWorkWithStrings;

public class Person 
{
    private String name;
    private String surname;
    private String patronymic;
    
    public Person(String name, String surname, String patronymic)
    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    
    public String getNSP()
    {
        String result = "";
        
        if(surname.equals(""))
        {
            result += "Фамилия отсутсвует";
        }
        else
        {
            result += surname;
        }
        if(name.equals(""))
        {
            result = "Имя отсутсвует";
        }
        else
        {
            result += name;
        }        
        if(patronymic.equals(""))
        {
            result += "Отчество отсутсвует";
        }
        else
        {
            result += patronymic;
        }
        
        return result;
    }
    
}
