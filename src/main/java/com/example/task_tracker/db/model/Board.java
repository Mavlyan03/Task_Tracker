package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "boards")
@NoArgsConstructor
@Getter
@Setter
public class Board {
    @Id
    @SequenceGenerator(name = "board_seq", sequenceName = "board_seq", allocationSize = 10)
    @GeneratedValue(generator = "board_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;
    private String image;
    private String color;
    private Boolean isFavorite;
}
