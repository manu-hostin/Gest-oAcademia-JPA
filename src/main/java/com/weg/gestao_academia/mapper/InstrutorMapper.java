package com.weg.gestao_academia.mapper;

import com.weg.gestao_academia.DTO.equipamento.EquipamentoRequisicao;
import com.weg.gestao_academia.DTO.equipamento.EquipamentoResposta;
import com.weg.gestao_academia.DTO.instrutor.InstrutorRequisicao;
import com.weg.gestao_academia.DTO.instrutor.InstrutorResposta;
import com.weg.gestao_academia.model.Equipamento;
import com.weg.gestao_academia.model.Instrutor;

public class InstrutorMapper {

    public static Instrutor paraEntidade (InstrutorRequisicao dto) {
        Instrutor instrutor = new Instrutor();

        instrutor.setNome(dto.getNome());
        instrutor.setEmail(dto.getEmail());
        instrutor.setTurno(dto.getTurno());
        instrutor.setEspecialidade(dto.getEspecialidade());
        instrutor.setSalario(dto.getSalario());

        return instrutor;
    }
    public static InstrutorResposta paraResposta (Instrutor instrutor){
        InstrutorResposta resposta = new InstrutorResposta();

        resposta.setId(instrutor.getId());
        resposta.setNome(instrutor.getNome());
        resposta.setEmail(instrutor.getEmail());
        resposta.setTurno(instrutor.getTurno());
        resposta.setSalario(instrutor.getSalario());
        resposta.setEspecialidade(instrutor.getEspecialidade());

        return resposta;
    }

}
