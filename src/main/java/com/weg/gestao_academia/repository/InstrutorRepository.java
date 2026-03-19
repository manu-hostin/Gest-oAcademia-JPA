package com.weg.gestao_academia.repository;

import com.weg.gestao_academia.model.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Integer> {

    Instrutor findByTurnoAndEspecialidade (String turno, String especialidade);

}