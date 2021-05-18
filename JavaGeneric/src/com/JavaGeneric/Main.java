package com.JavaGeneric;

public class Main
{
    public static void main(String[] args)
    {
        //task1();
        //task2();
        //Generic позволяют нам уйти от жесткого определения используемых типов
        //T указанная в коде позволяет нам при объявлении объета указать тип переменной которая будет использоваться
        //чтобы не писать несколько одинаковых методов на разные типы переменные
        //Использовать можно классы оболочки, но не работают с примитивными типами
    }

    public static void task1()
    {
        Box<String> box1 = new Box<String>("Box1");
        Box<Integer> box2 = new Box<Integer>(123);

        System.out.println("Первый бокс " + box1.getNameBox());
        System.out.println("Второй бокс " + box2.getNameBox());
    }

    static class Box<T>
    {
        private T nameBox;

        public Box(T nameBox)
        {
            this.nameBox = nameBox;
        }

        public T getNameBox()
        {
            return nameBox;
        }

    }

    public static void task2()
    {
        Integer[] data = {1,5,7,2,4,3};
        Sort srt = new Sort(data);



    }

    static class Sort
    {
        public <T> Sort(T[] data)
        {

            int dataLength = data.length;
            T swap;
            boolean sorted;

            for (int i = 0; i < dataLength; i++)
            {

                sorted = true;

                for (int a = 1; a < (dataLength - i); a++)
                {

                    if (data[a - 1] > data[a])
                    {
                        swap = data[a - 1];
                        data[a - 1] = data[a];
                        data[a] = swap;
                        sorted = false;
                    }

                }

                // если отсортировано - выходим, пропуская ненужный цикл.
                if (sorted) break;
            }
            System.out.println(data.toString());
        }

    }
}
