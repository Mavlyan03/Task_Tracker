package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "favorites")
@NoArgsConstructor
@Getter
@Setter
public class Favorite {
    @Id
    @SequenceGenerator(name = "favorite_seq", sequenceName = "favorite_seq", allocationSize = 10)
    @GeneratedValue(generator = "favorite_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE})
    private User statusChangedUser;

    @OneToOne(cascade = {DETACH, REFRESH, MERGE})
    private Workspace workspace;

    @OneToOne(cascade = {DETACH, REFRESH, MERGE})
    private Board board;
}
