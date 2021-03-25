package javaobject;

public final class PhoneNumber 
{
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) 
    {
        this.areaCode = rangeCheck(areaCode, 999);
        this.prefix   = rangeCheck(prefix,   999);
        this.lineNum  = rangeCheck(lineNum, 9999);
    }
    
    private static short rangeCheck(int val, int max) 
    {
        if (val < 0 || val > max) val = max;
        return (short) val;
    }

    @Override public boolean equals(Object o) 
    {
        if (o == this)return true;
        if (!(o instanceof PhoneNumber))return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }
    
    @Override public int hashCode()
    {
        int sum = areaCode + prefix + lineNum;
        return String.valueOf(sum).hashCode();
    }
    
    @Override public String toString()
    {
        String result = String.valueOf(areaCode) + String.valueOf(prefix) + String.valueOf(lineNum);
        return result;
    }
}

