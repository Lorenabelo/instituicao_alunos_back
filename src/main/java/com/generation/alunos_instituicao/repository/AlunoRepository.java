package com.generation.alunos_instituicao.repository;

import java.util.List;
import java.util.Optional;

import com.generation.alunos_instituicao.model.Aluno;

public interface AlunoRepository {
    Aluno save(Aluno aluno);
    List<Aluno> findAll();
    Optional<Aluno> findById(Long id);
    void deleteById(Long id);
}
