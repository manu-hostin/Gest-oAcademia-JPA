package com.weg.gestao_academia.service;

import com.weg.gestao_academia.DTO.aluno.AlunoRequisicao;
import com.weg.gestao_academia.DTO.aluno.AlunoResposta;
import com.weg.gestao_academia.mapper.AlunoMapper;
import com.weg.gestao_academia.model.Aluno;
import com.weg.gestao_academia.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {
    private final AlunoRepository repository;

    public AlunoResposta criarAluno (AlunoRequisicao requisicao) {
        Aluno aluno = AlunoMapper.paraEntidade(requisicao);
        Aluno salvo = repository.save(aluno);
        return AlunoMapper.paraResposta(salvo);
    }

    public List<AlunoResposta> listarAlunos () {
        List<Aluno> alunos = repository.findAll(); // Retornar uma lista de todos os alunos
        List<AlunoResposta> respostas = new ArrayList<>();

        for (Aluno aluno : alunos) {
            respostas.add(AlunoMapper.paraResposta(aluno));
        }

        return respostas; // Ele precisa retornar uma lista do tipo AlunoResposta, pq nós cadastramos assim
    }

    public AlunoResposta buscarAlunoId (int id) {
        Aluno aluno = repository.findById(id) // Retorna um aluno, então precisamos converter com o mapper
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        return AlunoMapper.paraResposta(aluno);
    }

    public void deletarAluno (int id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Aluno não encontrado!");
        }

        repository.deleteById(id);
    }

    public AlunoResposta atualizarAluno (int id, AlunoRequisicao requisicao) {
        Aluno aluno = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        aluno.setNome(requisicao.nome());
        aluno.setPeso(requisicao.peso());
        aluno.setAltura(requisicao.altura());
        aluno.setPlano(requisicao.plano());
        aluno.setTelefone(requisicao.telefone());

        Aluno alunoAtualizado = repository.save(aluno);
        return AlunoMapper.paraResposta(alunoAtualizado);
    }
}
