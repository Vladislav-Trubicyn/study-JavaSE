package com.JavaWorkWithClass;

public final class TrianglPaskal
{
    //первое значение треугольника
    private int Cnk = 1;

    public void drawTriangl()
    {
        for (int n = 0; n < 5; n++)
        {
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
}
