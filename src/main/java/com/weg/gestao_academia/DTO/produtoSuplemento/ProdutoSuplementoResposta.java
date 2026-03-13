package com.weg.gestao_academia.DTO.produtoSuplemento;

import lombok.Getter;
import lombok.Setter;

public record ProdutoSuplementoResposta (

    int id,

    String nome,

    String marca,

    Double preco,

    int quantidadeEstoque
){}
