package com.JavaWorkWithClass;

public class Human
{
    //Адресс человека
    private String adress;
    //Фамилия челоека
    private String surname;
    //Дата рождения
    private int date;

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    public void setDate(int date)
    {
        this.date = date;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getAdress()
    {
        return adress;
    }

    public int getDate()
    {
        return date;
    }

}
