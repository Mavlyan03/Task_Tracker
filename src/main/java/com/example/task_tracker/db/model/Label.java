package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "labels")
@NoArgsConstructor
@Getter
@Setter
public class Label {
    @Id
    @SequenceGenerator(name = "label_seq", sequenceName = "label_seq", allocationSize = 10)
    @GeneratedValue(generator = "label_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String description;
    private String color;
}
