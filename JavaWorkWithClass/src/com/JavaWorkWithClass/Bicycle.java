package com.JavaWorkWithClass;

public class Bicycle
{
    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public class SteeringWheel {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {

            System.out.println("Руль влево!");
        }
    }

    public class Seat {

        public void up() {

            System.out.println("Cиденье поднято выше!");
        }

        public void down() {

            System.out.println("Cиденье опущено ниже!");
        }
    }
}
