package com.weg.gestao_academia.repository;

import com.weg.gestao_academia.model.Aluno;
import com.weg.gestao_academia.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

    List<Aula> findByNivel (String nivel);

}
