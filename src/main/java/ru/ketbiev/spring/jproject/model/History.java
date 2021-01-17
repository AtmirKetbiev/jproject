package ru.ketbiev.spring.jproject.model;

import javax.persistence.*;

@Entity
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "time")
    private String time;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "book_id")
    private Book book;

    public History() {
    }

    public History(String time, String description, Book book) {
        this.time = time;
        this.description = description;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", book=" + book +
                '}';
    }
}
