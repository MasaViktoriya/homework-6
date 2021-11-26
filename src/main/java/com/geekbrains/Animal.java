package com.geekbrains;

import java.util.ArrayList;

public abstract class Animal {
    protected String name;
    protected String alias;
    protected int weight;
    protected String gender;
    public static int ANIMALCOUNT;

    protected void run(int runDistance){
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("м") || gender.equalsIgnoreCase("мужской")){
            System.out.println(name + " " +alias + " пробежал " + runDistance + " м");
        } else {
            System.out.println(name + " " +alias + " пробежала " + runDistance + " м");
        }
    }

    protected void swim(int swimDistance){
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("м") || gender.equalsIgnoreCase("мужской")){
            System.out.println(name + " " +alias + " проплыл " + swimDistance + " м");
        } else {
            System.out.println(name + " " +alias + " проплыла " + swimDistance + " м");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

