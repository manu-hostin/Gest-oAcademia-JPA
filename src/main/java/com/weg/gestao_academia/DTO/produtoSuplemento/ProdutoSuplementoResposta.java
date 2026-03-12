package com.weg.gestao_academia.DTO.produtoSuplemento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoSuplementoResposta {

    private int id;

    private String nome;

    private String marca;

    private Double preco;

    private int quantidadeEstoque;
}
