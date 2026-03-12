package com.weg.gestao_academia.DTO.aula;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AulaRequisicao {

    private String titulo;

    private String nivel;

    private int sala;

    private LocalDateTime diaHora;

    private Double duracao;
}
