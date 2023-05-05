package com.example.task_tracker.db.model;

import com.example.task_tracker.db.model.enums.ReminderType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static javax.persistence.CascadeType.*;

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
    private LocalDate startDate;
    private LocalDate dueDate;
    private LocalDateTime startTime;
    private LocalDateTime dueTime;
    @Enumerated(EnumType.STRING)
    private ReminderType reminderType;
    private LocalDateTime notificationTime;

    @OneToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private User user;

    @OneToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Card card;
}
