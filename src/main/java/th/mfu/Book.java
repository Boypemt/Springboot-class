package th.mfu;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class Book {
    private long id;
    private String title;
    private String author;
    @JsonProperty("publish-year")
    private int year;
    private LocalDate addDate;

    public Book(long id, String title, String author, int year, LocalDate addDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.addDate = addDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @JsonSerialize(using = LocalDateSerializer.class)
    public LocalDate getAddDate() {
        return addDate;
    }

    @JsonDeserialize(using = LocalDateDeserializer.class)
    public void setAddDate(LocalDate addDate) {
        this.addDate = addDate;
    }
    
}
