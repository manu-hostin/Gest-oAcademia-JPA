package com.weg.gestao_academia.DTO.instrutor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public record InstrutorResposta (

    int id,
    @NotBlank(message = "Digite o seu nome")
    String nome,

    @Email(message = "Digite seu email")
    String email,

    @NotBlank(message = "Digite a sua especialidade")
    String especialidade,

    @Min(value = 1700)
    Double salario,

    @NotBlank(message = "Digite o seu turno")
    String turno
){}
