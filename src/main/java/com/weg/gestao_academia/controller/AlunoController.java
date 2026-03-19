package com.weg.gestao_academia.controller;

import com.weg.gestao_academia.DTO.aluno.AlunoRequisicao;
import com.weg.gestao_academia.DTO.aluno.AlunoResposta;
import com.weg.gestao_academia.model.Aluno;
import com.weg.gestao_academia.service.AlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService service;

    @PostMapping("/cadastrar")
    public AlunoResposta cadastrarAluno (@Valid @RequestBody AlunoRequisicao requisicao) {
        return service.criarAluno(requisicao);
    }

    @GetMapping("/listar")
    public List<AlunoResposta> buscarAlunos () {
        return service.listarAlunos();
    }

    @GetMapping("/listar/planos")
    public List<AlunoResposta> buscarPlanos (@RequestBody List<String> planos) {
        return service.buscarPorPlano(planos);
    }
    @GetMapping("/listar/{id}")
    public AlunoResposta buscarAlunoId (@PathVariable int id) {
        return service.buscarAlunoId(id);
    }

    @PutMapping("/atualizar/{id}")
    public AlunoResposta atualizarAluno (@PathVariable int id, @RequestBody AlunoRequisicao requisicao) {
        return service.atualizarAluno(id, requisicao);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarAluno (@PathVariable int id) {
        service.deletarAluno(id);
    }
}
