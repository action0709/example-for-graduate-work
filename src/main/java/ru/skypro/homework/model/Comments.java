package ru.skypro.homework.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author;
    @Column
    private String authorImage;
    @Column
    private String authorFirstName;
    @Column
    private Long createdAt;
    @Column
    private Integer pk;
    @Column
    private String text;
    @Column
    private String title;
    @Column
    private Integer price;
    @Column
    private String description;
    

}
