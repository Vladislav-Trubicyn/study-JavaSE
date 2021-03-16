package com.JavaObject;

import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        ExtClass ec1 = new ExtClass((byte)1,2,3,"4");
        ExtClass ec2 = new ExtClass((byte)1,2,3,"44");

        System.out.println(ec1.equals(ec2));

    }

}
