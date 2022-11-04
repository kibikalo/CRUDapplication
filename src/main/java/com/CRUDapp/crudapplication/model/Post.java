package com.CRUDapp.crudapplication.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "posts")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "announcement")
    private String announcement;

    @Column(name = "full_text")
    private String fullText;
}
