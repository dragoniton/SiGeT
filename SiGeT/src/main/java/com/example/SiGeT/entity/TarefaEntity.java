package com.example.SiGeT.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class TarefaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tarefa_entity_seq")
    @SequenceGenerator(name = "tarefa_entity_seq", sequenceName = "tarefa_entity_seq", allocationSize = 1)
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String owner;

    @Column
    private String priority;

    @Column
    private String deadline;

    @Column
    private Boolean done;
}
