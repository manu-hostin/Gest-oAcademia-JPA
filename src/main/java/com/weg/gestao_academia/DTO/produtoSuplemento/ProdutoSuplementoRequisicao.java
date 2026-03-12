package com.weg.gestao_academia.DTO.produtoSuplemento;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoSuplementoRequisicao {

    private String nome;

    private String marca;

    private Double preco;

    private int quantidadeEstoque;
}
