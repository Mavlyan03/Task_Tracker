package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
}
