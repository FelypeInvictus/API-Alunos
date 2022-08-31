package com.exerciciosenai.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exerciciosenai.api.model.Alunos;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {

}
