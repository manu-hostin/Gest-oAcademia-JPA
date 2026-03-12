package com.weg.gestao_academia.mapper;

import com.weg.gestao_academia.DTO.aula.AulaRequisicao;
import com.weg.gestao_academia.DTO.aula.AulaResposta;
import com.weg.gestao_academia.DTO.produtoSuplemento.ProdutoSuplementoRequisicao;
import com.weg.gestao_academia.DTO.produtoSuplemento.ProdutoSuplementoResposta;
import com.weg.gestao_academia.model.Aula;
import com.weg.gestao_academia.model.ProdutoSuplemento;

public class ProdutoSuplementoMapper {

    public static ProdutoSuplemento paraEntidade (ProdutoSuplementoRequisicao dto) {
        ProdutoSuplemento prod = new ProdutoSuplemento();

        prod.setMarca(dto.getMarca());
        prod.setNome(dto.getNome());
        prod.setPreco(dto.getPreco());
        prod.setQuantidadeEstoque(dto.getQuantidadeEstoque());

        return prod;
    }
    public static ProdutoSuplementoResposta paraResposta (ProdutoSuplemento produtoSuplemento){
        ProdutoSuplementoResposta resposta = new ProdutoSuplementoResposta();

        resposta.setId(produtoSuplemento.getId());
        resposta.setNome(produtoSuplemento.getNome());
        resposta.setMarca(produtoSuplemento.getMarca());
        resposta.setPreco(produtoSuplemento.getPreco());
        resposta.setQuantidadeEstoque(produtoSuplemento.getQuantidadeEstoque());

        return resposta;
    }
}
