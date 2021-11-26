package com.geekbrains;

public class Cat extends Animal {

    public static int CATCOUNT;

    protected Cat(String name, String alias, String gender, int weight){
        this.name = name;
        this.alias = alias;
        this.gender = gender;
        this.weight = weight;
        ANIMALCOUNT ++;
        CATCOUNT ++;
        System.out.println("Замечено животное: " + name + " " + alias);

    }

    protected Cat(){
        this.name = "undefinedCat";
        this.alias = "undefined";
        ANIMALCOUNT ++;
        CATCOUNT ++;
        System.out.println("Замечена кошка Шредингера");
    }

    @Override
    protected void run(int runDistance){
        if (runDistance > 200){
            System.out.println(name + " " + alias + " пытается пробежать "+ runDistance +" м, а коты столько не бегают!");

        } else {
            super.run(runDistance);
        }
    }

    @Override
    protected void swim(int swimDistance){
        System.out.println("При попытке уплыть кот утонул. Они вообще не умеют плавать!");
    }
}
