package com.example.task_tracker.db.model;

import com.example.task_tracker.db.model.enums.NotificationType;
import com.example.task_tracker.db.model.enums.ReminderType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "notifications")
@NoArgsConstructor
@Getter
@Setter
public class Notification {
    @Id
    @SequenceGenerator(name = "notification_seq", sequenceName = "notification_seq", allocationSize = 10)
    @GeneratedValue(generator = "notification_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String message;
    private LocalDateTime createdAt;
    private Boolean isRead;
    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    @OneToOne
    private User fromUser;

    @ManyToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private User user;

    @OneToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Card card;

    @OneToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Column column;

    @OneToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Estimation estimation;

    @OneToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Board board;
}
