package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ad")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author;
    @Column
    private String image;
    @Column
    private Integer pk;
    @Column
    private Integer price;
    @Column
    private String title;
    @Column
    private String description;

}
