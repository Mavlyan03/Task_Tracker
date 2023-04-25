package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "columns")
@Getter
@Setter
@NoArgsConstructor
public class Column {
    @Id
    @SequenceGenerator(name = "column_seq", sequenceName = "column_seq", allocationSize = 10)
    @GeneratedValue(generator = "column_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private Boolean isArchive = false;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE})
    private User creator;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE})
    private Board board;

    @OneToOne(cascade = {ALL}, mappedBy = "column")
    private Basket basket;
}
