package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.CascadeType.*;

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
    private String background;
    private Boolean isFavorite;

    @ManyToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Workspace workspace;

    @OneToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Favorite favorite;

    @ManyToMany(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private List<User> members;

}
