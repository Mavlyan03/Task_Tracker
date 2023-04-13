package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "comments")
@NoArgsConstructor
@Getter
@Setter
public class Comment {
    @Id
    @SequenceGenerator(name = "comment_seq", sequenceName = "comment_seq", allocationSize = 10)
    @GeneratedValue(generator = "comment_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String comment;
    private String createdAt;
    private Boolean isMyComment;

    @ManyToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private User user;

    @ManyToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Card card;

}
