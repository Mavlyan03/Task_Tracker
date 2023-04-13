package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "attachments")
@NoArgsConstructor
@Getter
@Setter
public class Attachment {
    @Id
    @SequenceGenerator(name = "attachment_seq", sequenceName = "attachment_seq", allocationSize = 10)
    @GeneratedValue(generator = "attachment_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String link;
    private LocalDateTime attachedTime;
    @ManyToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Card card;
}
