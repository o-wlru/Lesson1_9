package ru.sky.pro.lesson1_9;

import java.util.Objects;

public class Autor {
    private final String firstName;
    private final String secondName;
    private final String id;

    public Autor(String firstName, String secondName, String id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.secondName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
            Autor a = (Autor) other;
            return id.equals(a.id) && firstName.equals(a.firstName) && secondName.equals(a.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName);
    }
}

