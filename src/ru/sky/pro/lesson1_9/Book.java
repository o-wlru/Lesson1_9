package ru.sky.pro.lesson1_9;

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


}
