package com.geekbrains;

public class Dog extends Animal {

    public static int DOGCOUNT;

    public Dog() {
        this.name = "undefinedDog";
        this.alias = "undefined";
        ANIMALCOUNT ++;
        DOGCOUNT ++;
        System.out.println("Замечена псина");
    }
    public Dog(String name, String alias, String gender, int weight) {
        this.name = name;
        this.alias = alias;
        this.gender = gender;
        this.weight = weight;
        ANIMALCOUNT ++;
        DOGCOUNT++;
        System.out.println("Замечено животное: " + name + " " + alias);
    }

    @Override
    protected void run(int runDistance){
        if (runDistance > 500){
            System.out.println(name + " " + alias + " пытается пробежать "+ runDistance + " м, а собаки столько не бегают!");
        } else {
            super.run(runDistance);
        }
    }

    @Override
    protected void swim(int swimDistance){
        if (swimDistance > 10){
            System.out.println(name + " " + alias + " пытается проплыть " + swimDistance + " м, а собаки столько не плавают!");
        }else {
            super.swim(swimDistance);
        }
    }
}
