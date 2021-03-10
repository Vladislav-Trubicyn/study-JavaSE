package com.JavaWorkWithClass;

import java.util.Random;
import java.util.Scanner;

public class GameStone
{
    //Текущий раунд
    private int round = 1;
    //Кол-во игроков
    private int countPlayers = 0;
    //кол-во игральных костей
    private int countBones = 0;

    public GameStone(int countPlayers, int gameStones)
    {
        //+ 1 это место для компьютера
        this.countPlayers = countPlayers + 1;
        this.countBones = gameStones;
    }

    public void start()
    {
        byte input = 0;

        //Объявляем кол-во игроков
        Player[] players = new Player[this.countPlayers];

        Scanner scn = new Scanner(System.in);

        //Создаем игроков
        for(int i = 0; i < countPlayers; i++)
        {
            //Добавляем 1 игрока, сам компьютер
            if(i == countPlayers - 1)
            {
                players[i] = new Player("Comp-1");
            }
            else
            {
                System.out.println("Введите имя " + (i+1) + "-ого игрока");
                players[i] = new Player(scn.nextLine());
            }

        }

        System.out.println("!!!Игра началась!!!");

        //Максимальное число и номер игрока
        int[] maxDigit = new int[2];

        while(round <= 7)
        {
            System.out.println("Раунд " + round + " начался");

            //Если макс число == 0, значит идет 1 раунд
            if(maxDigit[0] == 0)
            {
                for(int i = 0; i < countPlayers; i++)
                {
                    //Ход компьютера
                    if(i == countPlayers - 1)
                    {
                        System.out.println("Ход " + (i+1) + "-ого игрока " + players[i].getNamePlayer());
                        players[i].throwBone();
                    }
                    else
                    {
                        if(input == 0)
                        {
                            System.out.println("Ход " + (i+1) + "-ого игрока " + players[i].getNamePlayer());
                            System.out.println("Введите 1 для броска кубика");
                            input = scn.nextByte();
                        }
                        if(input == 1)
                        {
                            players[i].throwBone();
                        }
                        else
                        {
                            System.out.println("Игрок " + players[i].getNamePlayer() + " пропускает ход");
                        }
                    }

                    input = 0;
                }
            }
            else
            {
                if(maxDigit[1] == countPlayers - 1)
                {
                    System.out.println("Ход " + (maxDigit[1] + 1) + "-ого игрока " + players[maxDigit[1]].getNamePlayer());
                    players[maxDigit[1]].throwBone();
                }
                else
                {
                    System.out.println("Ход " + (maxDigit[1] + 1) + "-ого игрока " + players[maxDigit[1]].getNamePlayer());
                    System.out.println("Введите 1 для броска кубика");
                    input = scn.nextByte();

                    if(input == 1)
                    {
                        players[maxDigit[1]].throwBone();
                    }
                    else
                    {
                        System.out.println("Игрок " + players[maxDigit[1]].getNamePlayer() + " пропускает ход");
                    }
                    input = 0;
                }

                for(int i = 0; i < countPlayers; i++)
                {
                    if(maxDigit[1] != i)
                    {
                        if(i == countPlayers - 1)
                        {
                            System.out.println("Ход " + (i+1) + "-ого игрока " + players[i].getNamePlayer());
                            players[i].throwBone();
                        }
                        else
                        {
                            if(input == 0)
                            {
                                System.out.println("Ход " + (i+1) + "-ого игрока " + players[i].getNamePlayer());
                                System.out.println("Введите 1 для броска кубика");
                                input = scn.nextByte();
                            }
                            if(input == 1)
                            {
                                players[i].throwBone();
                            }
                            else
                            {
                                System.out.println("Игрок " + players[i].getNamePlayer() + " пропускает ход");
                            }
                        }
                    }

                    input = 0;
                }
            }

            //Задаем значения первого игрока как макс значение
            maxDigit[0] = players[0].getCountPoints();
            //Находим наибольшее число у игроков, для выбора победителя
            for(int i = 0; i < countPlayers; i++)
            {
                if(maxDigit[0] < players[i].getCountPoints())
                {
                    //Устаналиваем число
                    maxDigit[0] = players[i].getCountPoints();
                    //Устанавливаем номер игрока
                    maxDigit[1] = i;
                }
            }

            System.out.println("Раунд " + round + " закончился и победитель игрок " + players[maxDigit[1]].getNamePlayer());
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            round++;
        }

    }

    public class Player
    {
        //Кол-во очков у игрока
        private int countPoints = 0;
        private String namePlayer;

        //Конструктором задаем игроку имя игрока
        public Player(String namePlayer)
        {
            this.namePlayer = namePlayer;
        }

        //Метод броска игральной кости, присваеваем игроку случайное количество очков при "броске"
        public void throwBone()
        {
            Random rnd = new Random();
            int digit;

            //кидаются заданные кости
            for(byte i = 0; i < countBones; i++)
            {
                digit =  rnd.nextInt(6);
                //На случай, если выпадет 0
                if(digit == 0)
                {
                    digit = 1;
                }
                countPoints += digit;
                System.out.println("На " + (i+1) + "-ом кубике выпало число " + digit + " общее кол-во очков у игрока " + countPoints);
            }
            System.out.println("---------------------------------------------------------------------------------");
        }

        //Выводим имя игрока
        public String getNamePlayer()
        {
            return namePlayer;
        }

        //Вывод кол-ва очков
        public int getCountPoints()
        {
            return countPoints;
        }

    }

}
