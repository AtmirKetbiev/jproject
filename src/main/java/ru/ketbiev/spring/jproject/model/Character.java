package ru.ketbiev.spring.jproject.model;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

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

    @Column(name = "first_chapters_id")
    private int first_chapters_id;

    public Character() {
    }

    public Character(String name, String description, Book book, int first_chapters_id) {
        this.name = name;
        this.description = description;
        this.book = book;
        this.first_chapters_id = first_chapters_id;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getFirst_chapters_id() {
        return first_chapters_id;
    }

    public void setFirst_chapters_id(int first_chapters_id) {
        this.first_chapters_id = first_chapters_id;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", book=" + book +
                ", first_chapters_id=" + first_chapters_id +
                '}';
    }
}
