package com.geekbrains;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Animal> animalArrayList = new ArrayList<>(10);
        ArrayList<Cat> catArrayList = new ArrayList<>(10);
        ArrayList<String> dogArrayList = new ArrayList<>(10);
        Cat venik = new Cat("Кот", "Веник", "м", 6);
        Cat marfa = new Cat("Кошка", "Марфа", "женский", 2);
        Cat molly = new Cat();
        molly.setName("Котенок");
        molly.setAlias("Молли");
        molly.setGender("ж");
        System.out.println("Выяснилось, что это " + molly.getName() + " " + molly.getAlias());
        Dog julia = new Dog("Собака", "Джуля", "f", 10);
        Dog gunter = new Dog("Пёс", "Гюнтер", "m", 18);

        System.out.println("\nСтарт соревнований по бегу и плаванию среди животных! \n \nДля начала сосчитаем наших участников.");
        System.out.println("Всего животных: " + Animal.ANIMALCOUNT + ", \nиз них кошек: " + Cat.CATCOUNT + ", \nсобак: " + Dog.DOGCOUNT);
        System.out.println("\n Побежали!");

        venik.run(199);
        marfa.run(300);
        molly.run(20);
        julia.run(500);
        gunter.run(501);

        System.out.println("\nА теперь заплыв!\n");

        venik.swim(1);
        System.out.println("Другие коты не торопятся в воду, увидев, что произошло с их товарищем! Посмотрим на собак\n");
        julia.swim(11);
        gunter.swim(10);

        System.out.println("\nКак обычно, победила дружба!");
    }
}