package com.example.task_tracker.db.model;

import com.example.task_tracker.db.model.enums.ReminderType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    private LocalDate startedDate;
    private LocalDate dueDate;
    @Enumerated(EnumType.STRING)
    private ReminderType reminderType;
    private LocalDateTime notificationTime;

    @OneToOne
    private User user;

    @OneToOne
    private Card card;
}
