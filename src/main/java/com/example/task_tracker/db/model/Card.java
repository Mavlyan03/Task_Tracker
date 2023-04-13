package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "cards")
@NoArgsConstructor
@Getter
@Setter
public class Card {
    @Id
    @SequenceGenerator(name = "card_seq", sequenceName = "card_seq", allocationSize = 10)
    @GeneratedValue(generator = "card_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String description;
    private Boolean isArchived = false;
    private LocalDateTime createdAt;

    @ManyToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private User creator;

    @ManyToMany(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private List<User> members;

    @ManyToMany(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private List<Label> labels;

    @OneToMany(cascade = {ALL}, mappedBy = "card")
    private List<Checklist> checklists;

}
