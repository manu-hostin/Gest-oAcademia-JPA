package com.weg.gestao_academia.service;

import com.weg.gestao_academia.DTO.produtoSuplemento.ProdutoSuplementoRequisicao;
import com.weg.gestao_academia.DTO.produtoSuplemento.ProdutoSuplementoResposta;
import com.weg.gestao_academia.mapper.ProdutoSuplementoMapper;
import com.weg.gestao_academia.model.ProdutoSuplemento;
import com.weg.gestao_academia.repository.ProdutoSuplementoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProdutoSuplementoService {


        private final ProdutoSuplementoRepository repository;
        private final ProdutoSuplementoMapper mapper;

        public ProdutoSuplementoResposta criarProdutoSuplemento (ProdutoSuplementoRequisicao requisicao) {
            ProdutoSuplemento prod = mapper.paraEntidade(requisicao);
            ProdutoSuplemento salvo = repository.save(prod);

            return mapper.paraResposta(salvo);
        }

        public List<ProdutoSuplementoResposta> listarProdutoSuplementos () {
            List<ProdutoSuplemento> lista = repository.findAll();
            return mapper.paraListar(lista);
        }

        public ProdutoSuplementoResposta listarPorMarca (String marca) {
            ProdutoSuplemento prod = repository.findByMarca(marca);
            return mapper.paraResposta(prod);
        }

        public ProdutoSuplementoResposta buscarPorId (int id) {
            ProdutoSuplemento produtoSuplemento = repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Produto/Suplemento não cadastrado."));

            return mapper.paraResposta(produtoSuplemento);
        }

        public void deletarProdutoSuplemento (int id) {
            if (!repository.existsById(id)) {
                throw new RuntimeException("Produto/Suplemento não existe!");
            }
            repository.deleteById(id);
        }

        public ProdutoSuplementoResposta atualizarProdutoSuplemento (int id, ProdutoSuplementoRequisicao requisicao){
            ProdutoSuplemento produtoSuplemento = repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Produto/Suplemento não encontrado"));

            produtoSuplemento.setNome(requisicao.nome());
            produtoSuplemento.setQuantidadeEstoque(requisicao.quantidadeEstoque());
            produtoSuplemento.setMarca(requisicao.marca());
            produtoSuplemento.setPreco(requisicao.preco());

            ProdutoSuplemento prod = repository.save(produtoSuplemento);
            return mapper.paraResposta(prod);
        }
    }

