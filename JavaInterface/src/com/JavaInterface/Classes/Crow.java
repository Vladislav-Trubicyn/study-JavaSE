package com.JavaInterface.Classes;

import com.JavaInterface.Interfaces.Voice;
import com.JavaInterface.Interfaces.Wings;

public class Crow implements Voice, Wings
{
    public void makeVoice()
    {
        System.out.println("Кар-кар-кар");
    }

    public void moveWings()
    {
        System.out.println("Вжух-вжух и полетели!");
    }
}
