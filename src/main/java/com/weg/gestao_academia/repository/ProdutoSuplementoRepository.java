package com.weg.gestao_academia.repository;

import com.weg.gestao_academia.model.ProdutoSuplemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoSuplementoRepository extends JpaRepository<ProdutoSuplemento, Integer> {
}
