package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "baskets")
@NoArgsConstructor
@Getter
@Setter
public class Basket {
    @Id
    @SequenceGenerator(name = "basket_seq", sequenceName = "basket_seq", allocationSize = 10)
    @GeneratedValue(generator = "basket_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
}
