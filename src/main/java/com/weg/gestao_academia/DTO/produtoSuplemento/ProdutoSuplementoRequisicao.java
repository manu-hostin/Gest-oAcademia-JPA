package com.weg.gestao_academia.DTO.produtoSuplemento;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;


public record ProdutoSuplementoRequisicao (

        @NotBlank(message = "Digite o nome do produto ou suplemento")
        String nome,
        @NotBlank(message = "Digite a marca")
        String marca,
        @PositiveOrZero(message = "Digite o preço")
        Double preco,

        @PositiveOrZero(message = "A quantidade deve ser 0 ou positiva")
        int quantidadeEstoque
){}
