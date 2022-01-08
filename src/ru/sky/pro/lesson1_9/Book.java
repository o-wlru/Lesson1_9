package ru.sky.pro.lesson1_9;

import java.util.Objects;

public class Book {
    public int yearBook;
    private final String title;
    private final Autor autor;

    public Book(Autor autor, String title, int yearBook) {
        this.autor = autor;
        this.title = title;
        this.yearBook = yearBook;
    }


    public Autor getAutor() {
        return autor;
    }

    public String getTitle(String гарри_поттер_и_филосовский_камень) {
        return this.title;
    }
    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    @Override
    public String toString() {
        return this.autor + ", " + this.title + ", " + this.yearBook + "г.";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b = (Book) other;
        return Objects.equals(autor, b.autor) && Objects.equals(title, b.title) && Objects.equals(yearBook, b.yearBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor,title,yearBook);
    }

}
