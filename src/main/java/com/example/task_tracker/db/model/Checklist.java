package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "checklists")
@NoArgsConstructor
@Getter
@Setter
public class Checklist {
    @Id
    @SequenceGenerator(name = "checklist_seq", sequenceName = "checklist_seq", allocationSize = 10)
    @GeneratedValue(generator = "checklist_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private int count;
    @OneToMany(cascade = ALL, mappedBy = "checklist")
    private List<Subtask> subtasks;
    @ManyToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Card card;
}
