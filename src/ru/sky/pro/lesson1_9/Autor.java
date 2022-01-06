package ru.sky.pro.lesson1_9;

public class Autor {
    private final String firstName;
    private final String secondName;

    public Autor(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getSecondName() {
        return this.secondName;
    }


}
