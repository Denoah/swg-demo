package com.example.swgdemo.core.book.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Table(name = "swg_book")
@ApiModel(description = "Книга")
public class Book {
    @GenericGenerator(
            name = "swg_book_seq",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "swg_book_seq"),
                    @Parameter(name = "INCREMENT", value = "1"),
                    @Parameter(name = "MINVALUE", value = "1"),
                    @Parameter(name = "MAXVALUE", value = "2147483647"),
                    @Parameter(name = "CACHE", value = "1")
            }
    )
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "swg_book_seq")
    @Column(name = "id", nullable = false, updatable = false)
    @ApiModelProperty(notes = "id книги")
    private Long id;

    @Column(name = "author")
    @ApiModelProperty(notes = "Автор")
    private String author;

    @Column(name = "title")
    @ApiModelProperty(notes = "Название")
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
