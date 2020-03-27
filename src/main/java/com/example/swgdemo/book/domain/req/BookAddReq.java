package com.example.swgdemo.book.domain.req;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class BookAddReq implements Serializable {
    @NotNull
    private String author;

    @NotNull
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
