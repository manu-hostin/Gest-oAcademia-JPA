package com.weg.gestao_academia.controller;

import com.weg.gestao_academia.DTO.instrutor.InstrutorRequisicao;
import com.weg.gestao_academia.DTO.instrutor.InstrutorResposta;
import com.weg.gestao_academia.DTO.produtoSuplemento.ProdutoSuplementoRequisicao;
import com.weg.gestao_academia.DTO.produtoSuplemento.ProdutoSuplementoResposta;
import com.weg.gestao_academia.service.InstrutorService;
import com.weg.gestao_academia.service.ProdutoSuplementoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produtos")
public class ProdutoSuplementoController {

    private final ProdutoSuplementoService service;

    @PostMapping("/cadastrar")
    public ProdutoSuplementoResposta cadastrarProdutoSuplemento (@Valid @RequestBody ProdutoSuplementoRequisicao requisicao) {
        return service.criarProdutoSuplemento(requisicao);
    }

    @GetMapping("/listar")
    public List<ProdutoSuplementoResposta> buscarProdutoSuplementos () {
        return service.listarProdutoSuplementos();
    }

    @GetMapping("/listar/{id}")
    public ProdutoSuplementoResposta buscarPorId (@PathVariable int id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/atualizar/{id}")
    public ProdutoSuplementoResposta atualizarProdutoSuplemento (@PathVariable int id, @RequestBody ProdutoSuplementoRequisicao requisicao) {
        return service.atualizarProdutoSuplemento(id, requisicao);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarProdutoSuplemento (@PathVariable int id) {
        service.deletarProdutoSuplemento(id);
    }
}
