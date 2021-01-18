package ru.ketbiev.spring.jproject.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL
            //, mappedBy = "book"
            , fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Set<Chapter> chapters;

    @OneToMany(cascade = CascadeType.ALL
            //, mappedBy = "book"
            , fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Set<Character> characters;

    @OneToMany(cascade = CascadeType.ALL
            //, mappedBy = "book"
            , fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Set<Geography> geographies;

    @OneToMany(cascade = CascadeType.ALL
            //, mappedBy = "book"
            , fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Set<History> histories;

    @OneToMany(cascade = CascadeType.ALL
            //, mappedBy = "book"
            , fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Set<Note> notes;

    public Book() {
    }

    public Book(String name, String description, User user) {
        this.name = name;
        this.description = description;
        this.user = user;
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

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public int getUserId() {
        return user.getId();
    }

    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Set<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    public Set<Geography> getGeographies() {
        return geographies;
    }

    public void setGeographies(Set<Geography> geographies) {
        this.geographies = geographies;
    }

    public Set<History> getHistories() {
        return histories;
    }

    public void setHistories(Set<History> histories) {
        this.histories = histories;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                //", user=" + user.getUsername() +
                ", chapters=" + chapters +
                ", characters=" + characters +
                ", geographies=" + geographies +
                ", histories=" + histories +
                ", notes=" + notes +
                '}';
    }
}
