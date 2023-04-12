package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
}
