package javaobject;

public class Triangle 
{
    private int z;
    
    public Triangle(int z)
    {
        this.z = z;
    }
    
    public void drawTriangle()
    {
        for (int n = 0; n < z; n++)
        {
            //первое значение треугольника
            int Cnk = 1;
            System.out.print(Cnk);

            //Находим остальные строки треугольника
            for (int k = 1; k <= n; k++)
            {
                Cnk *= (n - k + 1);
                Cnk /= k;
                System.out.print(" "); System.out.print(Cnk);
            }
            System.out.println();
        }
    }
    
     @Override public boolean equals(Object o) 
    {
        if (o == this)return true;
        if (!(o instanceof Triangle))return false;
        Triangle fb = (Triangle)o;
        return fb.z == z;
    }
    
    @Override public int hashCode()
    {
        int sum = z;
        return String.valueOf(sum).hashCode();
    }
    
    @Override public String toString()
    {
        return String.valueOf(z);
    }
    
}
