package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "subtasks")
@NoArgsConstructor
@Getter
@Setter
public class Subtask {
    @Id
    @SequenceGenerator(name = "subtask_seq", sequenceName = "subtask_seq", allocationSize = 10)
    @GeneratedValue(generator = "subtask_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String description;
    private Boolean isDone = false;
    @ManyToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Checklist checklist;
}
