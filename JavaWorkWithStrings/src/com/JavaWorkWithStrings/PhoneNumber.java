package com.JavaWorkWithStrings;

public class PhoneNumber 
{         
    public static String convertNumber(String str)
    {
        String result = "";

        if(str.charAt(0) == '+')
        {
            result = str.substring(0,5) + "-" + str.substring(5,8) + "-" + str.substring(8,12);
        }
        else
        {
            if(str.charAt(0) == '8')
            {
                result = "+7" + str.substring(1,4) + "-" + str.substring(4,7) + "-" + str.substring(7,11);
            }
            else
            {
                result = "+" + str.charAt(0) + str.substring(1,4) + "-" + str.substring(4,7) + "-" + str.substring(7,11);
            }

        }

        return result;
    }
}
