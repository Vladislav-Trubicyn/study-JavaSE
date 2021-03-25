package javaobject;

public class Fibonachichi 
{
    private int x1 = 0, x2 = 1, n, sum_fib;

    public Fibonachichi(int n)
    {
        this.n = n;
    }
    
    public void drawFib()
    {        

        for(int i = 0; i < n; i++)
        {
            sum_fib = x1 + x2;
            x1 = x2;
            x2 = sum_fib;
            System.out.print(sum_fib + " ");
        }
    }
    
    @Override public boolean equals(Object o) 
    {
        if (o == this)return true;
        if (!(o instanceof Fibonachichi))return false;
        Fibonachichi fb = (Fibonachichi)o;
        return fb.n == n;
    }
    
    @Override public int hashCode()
    {
        int sum = n;
        return String.valueOf(sum).hashCode();
    }
    
    @Override public String toString()
    {
        return String.valueOf(n);
    }
    
}
