package ru.olegcherednik.utils.gson.feign.app.dto;

/**
 * @author Oleg Cherednik
 * @since 30.01.2021
 */
public class Book {

    private String title;
    private String author;
    private String response;

    public Book() {
    }

    public Book(String title, String author, String response) {
        this.title = title;
        this.author = author;
        this.response = response;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
