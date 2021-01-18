package ru.ketbiev.spring.jproject.model;

import javax.persistence.*;

@Entity
@Table(name = "geography")
public class Geography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "book_id")
    private Book book;

    public Geography() {
    }

    public Geography(String name, String description, Book book) {
        this.name = name;
        this.description = description;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }

    public int getBookId() {
        return book.getId();
    }

    @Override
    public String toString() {
        return "Geography{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", book=" + book.getName() +
                '}';
    }
}
