package com.JavaInterface.Classes;

import com.JavaInterface.Interfaces.Voice;
import com.JavaInterface.Interfaces.Wool;

public class Cat implements Voice, Wool
{
    public void makeVoice()
    {
        System.out.println("Мяу");
    }

    public void woool()
    {
        System.out.println("Мягкая шерсть");
    }
}
