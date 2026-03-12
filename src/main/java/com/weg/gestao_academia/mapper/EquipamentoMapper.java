package com.weg.gestao_academia.mapper;

import com.weg.gestao_academia.DTO.aula.AulaRequisicao;
import com.weg.gestao_academia.DTO.aula.AulaResposta;
import com.weg.gestao_academia.DTO.equipamento.EquipamentoRequisicao;
import com.weg.gestao_academia.DTO.equipamento.EquipamentoResposta;
import com.weg.gestao_academia.model.Aula;
import com.weg.gestao_academia.model.Equipamento;

public class EquipamentoMapper {

    public static Equipamento paraEntidade (EquipamentoRequisicao dto) {
        Equipamento eq = new Equipamento();

        eq.setNome(dto.getNome());
        eq.setDataCompra(dto.getDataCompra());
        eq.setStatus(dto.getStatus());
        eq.setPesoMaximo(dto.getPesoMaximo());
        eq.setMarca(dto.getMarca());

        return eq;
    }
    public static EquipamentoResposta paraResposta (Equipamento eq){
        EquipamentoResposta resposta = new EquipamentoResposta();

        resposta.setId(eq.getId());
        resposta.setNome(eq.getNome());
        resposta.setDataCompra(eq.getDataCompra());
        resposta.setStatus(eq.getStatus());
        resposta.setMarca(eq.getMarca());
        resposta.setPesoMaximo(eq.getPesoMaximo());

        return resposta;
    }
}
