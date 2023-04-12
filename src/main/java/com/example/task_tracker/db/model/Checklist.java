package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
}
