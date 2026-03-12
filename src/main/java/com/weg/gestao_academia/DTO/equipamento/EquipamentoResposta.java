package com.weg.gestao_academia.DTO.equipamento;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EquipamentoResposta {

    private int id;

    private String nome;

    private String marca;

    private Long pesoMaximo;

    private LocalDateTime dataCompra;

    private String status;
}
