package com.example.task_tracker.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
}
