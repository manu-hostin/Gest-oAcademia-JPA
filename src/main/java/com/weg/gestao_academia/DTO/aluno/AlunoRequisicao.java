package com.weg.gestao_academia.DTO.aluno;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record AlunoRequisicao (

    @NotBlank(message = "Digite o seu nome")
    String nome,

    @Positive(message = "Valor deve ser positivo")
    @NotNull
    Double peso,

    @Positive(message = "Valor deve ser positivo")
    @NotNull
    Double altura,

    @NotBlank(message = "Digite o tipo do plano")
    String plano,

    @NotNull(message = "Número de telefone inválido")
    @Max(value = 999999999)
    String telefone
){}
