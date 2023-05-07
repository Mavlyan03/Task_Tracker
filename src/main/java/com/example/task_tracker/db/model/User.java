package com.example.task_tracker.db.model;


import com.example.task_tracker.db.model.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 10)
    @GeneratedValue(generator = "user_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String image;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(cascade = {
            REFRESH,
            DETACH,
            MERGE}, mappedBy = "lead")
    private List<Workspace> workspaces;

    @OneToMany(cascade = ALL, mappedBy = "statusChangedUser")
    private List<Favorite> favorites;

    @OneToMany(cascade = ALL, mappedBy = "user")
    private List<Comment> comments;

    @OneToMany(cascade = ALL, mappedBy = "creator")
    private List<Card> cards;

    @OneToMany(cascade = ALL, mappedBy = "archivedUser")
    private List<Basket> baskets;

    @OneToMany(cascade = ALL, mappedBy = "creator")
    private List<Column> columns;

    @OneToMany(cascade = ALL, mappedBy = "user")
    private List<UserWorkspace> userWorkspaces;

}
