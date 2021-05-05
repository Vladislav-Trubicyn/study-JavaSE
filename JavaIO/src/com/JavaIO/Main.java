package com.JavaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //task1();
        //task2();
        //task3();
        //task4();
        task5();
    }

    public static void task1()
    {
        //Пример строки создания объекта Path пути для запуска
        Path testFilePath = Paths.get("C:\\Users\\Vladislav\\Desktop\\Учеба\\JavaSE\\JavaIO\\src\\com\\JavaIO\\Main.java");

        //Вывод инормации о файле
        System.out.println("Information: ");
        System.out.println("\t Имя файла: " + testFilePath.getFileName());
        System.out.println("\t Корень пути: " + testFilePath.getRoot());
        System.out.println("\t Родитель пути: " + testFilePath.getParent());

        System.out.println("Содержимое файла: \n");

        try
        {
            //Считываем все из файла побайтно
            byte[] text = Files.readAllBytes(testFilePath);
            //Создаем строку для вывода
            System.out.println(new String(text, "UTF-8"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void task2()
    {
        //Создаем файл
        try(FileWriter writer = new FileWriter("txt_1.txt", false))
        {
            //Записываем в файл некоторые значения
            writer.write("123");
            writer.append('\n');
            writer.write("126");
            writer.append('\n');
            writer.write("12345");
            writer.append('\n');
            writer.write("12346");
            writer.append('\n');
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        Path path = Paths.get("C:\\Users\\Vladislav\\Desktop\\Учеба\\JavaSE\\JavaIO\\txt_1.txt");

        Scanner scan= null;
        try
        {
            scan = new Scanner(path);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        //Для нахождения среднего числа
        int sum = 0, count = 0;

        while(scan.hasNext())
        {
            sum += scan.nextInt();
            count++;
        }
        System.out.println("Среднее " + (sum / count));
    }

    public static void task3()
    {
        try(FileWriter writer = new FileWriter("txt_1.txt", false))
        {
            writer.write("123");
            writer.append('\n');
            writer.write("126");
            writer.append('\n');
            writer.write("12345");
            writer.append('\n');
            writer.write("12346");
            writer.append('\n');
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        Path path = Paths.get("C:\\Users\\Vladislav\\Desktop\\Учеба\\JavaSE\\JavaIO\\txt_1.txt");

        Scanner scan= null;
        try
        {
            scan = new Scanner(path);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        ArrayList<Byte> arrByte = new ArrayList<>();
        ArrayList<Integer> arrInt = new ArrayList<>();

        while(scan.hasNext())
        {
            var chisl = scan.nextInt();
            if(chisl < 127)
            {
                arrByte.add((byte) chisl);
            }
            else
            {
                arrInt.add(chisl);
            }
        }

        System.out.println(arrByte.size());
        System.out.println(arrInt.size());
    }

    public static void task4()
    {
        try(FileWriter writer = new FileWriter("txt_1.txt", false))
        {
            writer.write("123");
            writer.append('\n');
            writer.write("126");
            writer.append('\n');
            writer.write("12345");
            writer.append('\n');
            writer.write("12346");
            writer.append('\n');
            writer.write("2147483647");
            writer.append('\n');
            writer.write("2147483648");
            writer.append('\n');
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        Path path = Paths.get("C:\\Users\\Vladislav\\Desktop\\Учеба\\JavaSE\\JavaIO\\txt_1.txt");

        Scanner scan= null;
        try
        {
            scan = new Scanner(path);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        ArrayList<Integer> arrInt = new ArrayList<>();
        while(scan.hasNext())
        {
            var chisl = scan.nextLong();
            if(chisl <= 2147483647)
            {
                arrInt.add((int) chisl);
            }
        }
        System.out.println(arrInt.size());
    }

    public static void task5()
    {
        Path path = Paths.get("C:\\Users\\Vladislav\\Desktop\\Учеба\\JavaSE\\JavaIO\\text.txt");

        Scanner scan= null;
        try
        {
            scan = new Scanner(path);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        int countWordJava = 0;
        String line = "", text = "";

        while(scan.hasNext())
        {
            line = scan.nextLine();

            if(line.indexOf("Java") != -1)
            {
                countWordJava++;
            }

            text += line;

            if(countWordJava == 3)
            {
                break;
            }

        }

        System.out.println(text);

    }

}
