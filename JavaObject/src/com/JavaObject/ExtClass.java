package com.JavaObject;

public class ExtClass
{
    private byte b;
    private int i;
    private double d;
    private String s;

    public ExtClass(byte b, int i, double d, String s)
    {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }

    public boolean equals(Object obj)
    {
        boolean result;
        ExtClass ec = (ExtClass) obj;

        if(this.b == ((ExtClass) obj).b && this.i == ((ExtClass) obj).i &&
                this.d == ((ExtClass) obj).d && this.s == ((ExtClass) obj).s)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result ;
    }

    public int hashCode()
    {
        return (s + b + i + d).hashCode();
    }

    public String toString()
    {
        return String.format(b + i + d + s);
    }

}
