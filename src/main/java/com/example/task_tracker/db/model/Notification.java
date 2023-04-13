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
    private String text;
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    @ManyToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private User user;
}
