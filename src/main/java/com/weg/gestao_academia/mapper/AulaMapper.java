package com.weg.gestao_academia.mapper;

import com.weg.gestao_academia.DTO.aluno.AlunoRequisicao;
import com.weg.gestao_academia.DTO.aluno.AlunoResposta;
import com.weg.gestao_academia.DTO.aula.AulaRequisicao;
import com.weg.gestao_academia.DTO.aula.AulaResposta;
import com.weg.gestao_academia.model.Aluno;
import com.weg.gestao_academia.model.Aula;

public class AulaMapper {

    public static Aula paraEntidade (AulaRequisicao dto) {
        Aula aula = new Aula();

        aula.setSala(dto.getSala());
        aula.setNivel(dto.getNivel());
        aula.setTitulo(dto.getTitulo());
        aula.setDuracao(dto.getDuracao());
        aula.setDiaHora(dto.getDiaHora());

        return aula;
    }
    public static AulaResposta paraResposta (Aula aula){
        AulaResposta resposta = new AulaResposta();

        resposta.setId(aula.getId());
        resposta.setSala(aula.getSala());
        resposta.setTitulo(aula.getTitulo());
        resposta.setNivel(aula.getNivel());
        resposta.setDiaHora(aula.getDiaHora());
        resposta.setDuracao(aula.getDuracao());

        return resposta;
    }
}
