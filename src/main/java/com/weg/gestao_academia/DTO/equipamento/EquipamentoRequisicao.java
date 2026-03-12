package com.weg.gestao_academia.DTO.equipamento;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


public record EquipamentoRequisicao (

        @NotBlank(message = "Digite o seu nome")
        String nome,

        @NotBlank(message = "Digite a marca")
        String marca,

        @NotNull
        Long pesoMaximo,

        @Past
        LocalDateTime dataCompra,

        @NotBlank(message = "Digite o status")
        String status
){}
