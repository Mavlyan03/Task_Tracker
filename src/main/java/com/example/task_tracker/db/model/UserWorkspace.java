package com.example.task_tracker.db.model;

import com.example.task_tracker.db.model.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "user_workspaces")
@Getter
@Setter
@NoArgsConstructor
public class UserWorkspace {
    @Id
    @SequenceGenerator(name = "user_workspace_seq", sequenceName = "user_workspace_seq", allocationSize = 1)
    @GeneratedValue(generator = "user_workspace_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne(cascade = {
            REFRESH,
            DETACH,
            MERGE})
    private User user;

    @ManyToOne(cascade = {
            REFRESH,
            DETACH,
            MERGE})
    private Workspace workspace;
}
