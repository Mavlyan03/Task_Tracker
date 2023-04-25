package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "workspaces")
@NoArgsConstructor
@Getter
@Setter
public class Workspace {
    @Id
    @SequenceGenerator(name = "workspace_seq", sequenceName = "workspace_seq", allocationSize = 10)
    @GeneratedValue(generator = "workspace_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Boolean isFavorite;

    @ManyToOne(cascade = {
            REFRESH,
            DETACH,
            MERGE,
            PERSIST})
    private User lead;

    @ManyToMany(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private List<User> members;

    @OneToMany(cascade = ALL, mappedBy = "workspace")
    private List<Board> boards;

    @OneToOne(cascade = {
            DETACH,
            REFRESH,
            MERGE})
    private Favorite favorite;

    @OneToMany(cascade = ALL, mappedBy = "workspace")
    private List<UserWorkspace> userWorkspaces;
}
