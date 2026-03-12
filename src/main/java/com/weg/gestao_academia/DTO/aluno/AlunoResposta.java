package com.weg.gestao_academia.DTO.aluno;

import lombok.Getter;
import lombok.Setter;

public record AlunoResposta (

     int id,

     String nome,

     Double peso,

     Double altura,

     String plano,

     String telefone
){}
