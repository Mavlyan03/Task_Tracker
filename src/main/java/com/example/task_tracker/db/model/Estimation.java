package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "estimations")
@NoArgsConstructor
@Getter
@Setter
public class Estimation {
    @Id
    @SequenceGenerator(name = "estimation_seq", sequenceName = "estimation_seq", allocationSize = 10)
    @GeneratedValue(generator = "estimation_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
}
