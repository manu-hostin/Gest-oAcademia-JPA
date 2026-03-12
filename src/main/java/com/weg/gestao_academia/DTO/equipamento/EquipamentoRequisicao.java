package com.weg.gestao_academia.DTO.equipamento;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class EquipamentoRequisicao {


    private String nome;

    private String marca;

    private Long pesoMaximo;

    private LocalDateTime dataCompra;

    private String status;
}
