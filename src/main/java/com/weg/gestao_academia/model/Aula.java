package com.weg.gestao_academia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "aula")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String nivel;

    @Column(nullable = false)
    private int sala;

    @Column(nullable = false)
    private LocalDateTime diaHora;

    @Column(nullable = false)
    private Double duracao;

}
