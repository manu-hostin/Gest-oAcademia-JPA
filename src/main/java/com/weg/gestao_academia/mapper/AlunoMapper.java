package com.weg.gestao_academia.mapper;

import com.weg.gestao_academia.DTO.aluno.AlunoRequisicao;
import com.weg.gestao_academia.DTO.aluno.AlunoResposta;
import com.weg.gestao_academia.model.Aluno;

public class AlunoMapper {

    public static Aluno paraEntidade (AlunoRequisicao dto) {
        Aluno aluno = new Aluno();

        aluno.setNome(dto.nome());
        aluno.setPeso(dto.peso());
        aluno.setAltura(dto.altura());
        aluno.setPlano(dto.plano());
        aluno.setTelefone(dto.telefone());

        return aluno;
    }
    public static AlunoResposta paraResposta (Aluno aluno){
        return new AlunoResposta (

            aluno.getId(),
            aluno.getNome(),
            aluno.getPeso(),
            aluno.getAltura(),
            aluno.getPlano(),
            aluno.getTelefone()

        );
    }
}
