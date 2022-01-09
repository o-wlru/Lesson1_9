package ru.sky.pro;

import ru.sky.pro.lesson1_9.Autor;
import ru.sky.pro.lesson1_9.Book;

public class Main {

    public static void main(String[] args) {

        Autor rouling = new Autor("Джоан", "Роулинг", "001");
        Autor tolkin = new Autor("Джон", "Толкин", "002");
        System.out.println(rouling);
        System.out.println(tolkin);

        Book harryPotterAndPhilosopherSStone = new Book(rouling,"Гарри Поттер и философский камень", 1997);
        Book theLordOfTheRings = new Book(tolkin, "Властелин колец", 1954);

        System.out.println(harryPotterAndPhilosopherSStone);
        System.out.println(theLordOfTheRings);

        System.out.println("Изменение года издания:");
        harryPotterAndPhilosopherSStone.setYearBook(2001);
        System.out.println(harryPotterAndPhilosopherSStone);

    }
}
