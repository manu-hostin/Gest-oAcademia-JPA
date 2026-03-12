package com.weg.gestao_academia.DTO.instrutor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstrutorRequisicao {

    private int Id;

    private String nome;

    private String email;

    private String especialidade;

    private Double salario;

    private String turno;
}