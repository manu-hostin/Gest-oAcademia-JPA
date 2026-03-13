package com.weg.gestao_academia.mapper;

import com.weg.gestao_academia.DTO.aula.AulaRequisicao;
import com.weg.gestao_academia.DTO.aula.AulaResposta;
import com.weg.gestao_academia.DTO.produtoSuplemento.ProdutoSuplementoRequisicao;
import com.weg.gestao_academia.DTO.produtoSuplemento.ProdutoSuplementoResposta;
import com.weg.gestao_academia.model.Aula;
import com.weg.gestao_academia.model.ProdutoSuplemento;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProdutoSuplementoMapper {

        public ProdutoSuplemento paraEntidade (ProdutoSuplementoRequisicao dto) {
            ProdutoSuplemento prod = new ProdutoSuplemento();

            prod.setMarca(dto.marca());
            prod.setNome(dto.nome());
            prod.setPreco(dto.preco());
            prod.setQuantidadeEstoque(dto.quantidadeEstoque());

            return prod;
        }
        public ProdutoSuplementoResposta paraResposta (ProdutoSuplemento prod){
            return new ProdutoSuplementoResposta(

                    prod.getId(),
                    prod.getNome(),
                    prod.getMarca(),
                    prod.getPreco(),
                    prod.getQuantidadeEstoque()
            );
        }

        public List<ProdutoSuplementoResposta> paraListar(List<ProdutoSuplemento> produtoSuplementos) {
            List<ProdutoSuplementoResposta> lista = new ArrayList<>();

            for (ProdutoSuplemento produtoSuplemento : produtoSuplementos){
                lista.add(paraResposta(produtoSuplemento));
            }
            return lista;
        }
    }