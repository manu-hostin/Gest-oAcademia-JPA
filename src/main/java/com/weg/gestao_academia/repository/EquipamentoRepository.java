package com.weg.gestao_academia.repository;

import com.weg.gestao_academia.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer> {

    Equipamento findByNome (String nome);

}
