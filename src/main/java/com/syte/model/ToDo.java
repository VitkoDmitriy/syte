package com.syte.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
@Table(name = "todo")
@ToString
@Setter
@Getter
@EqualsAndHashCode
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "todo_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date todoDate;

    @Column(name = "creation_date", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    @CreationTimestamp
    private Date creationDate;

    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    @UpdateTimestamp
    private Date updateDate;

    @Column(name = "is_complete")
    private boolean isComplete;

    public ToDo() {
    }

    public ToDo(String title, String description, String todoDate, boolean isComplete) throws ParseException {
        this.title = title;
        this.description = description;
        this.todoDate = new SimpleDateFormat("yyyy-MM-dd").parse(todoDate);
        this.isComplete = isComplete;
    }

    public ToDo(int id, String title, String description, String todoDate, boolean isComplete, String creationDate, String updateDate) throws ParseException {
        this.id = id;
        this.title = title;
        this.description = description;
        this.todoDate = new SimpleDateFormat("yyyy-MM-dd").parse(todoDate);
        this.isComplete = isComplete;
        this.creationDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(creationDate);
        this.updateDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(updateDate);
    }
}