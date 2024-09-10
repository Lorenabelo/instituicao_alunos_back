package com.generation.alunos_instituicao.repository;

import org.springframework.stereotype.Repository;

import com.generation.alunos_instituicao.model.Aluno;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class AlunoRepositoryInMemory implements AlunoRepository {

    private final Map<Long, Aluno> alunos = new HashMap<>();
    private final AtomicLong contador = new AtomicLong();

    @Override
    public Aluno save(Aluno aluno) {
        if (aluno.getId() == null) {
            aluno.setId(contador.incrementAndGet());
        }
        alunos.put(aluno.getId(), aluno);
        return aluno;
    }

    @Override
    public List<Aluno> findAll() {
        return new ArrayList<>(alunos.values());
    }

    @Override
    public Optional<Aluno> findById(Long id) {
        return Optional.ofNullable(alunos.get(id));
    }

    @Override
    public void deleteById(Long id) {
        alunos.remove(id);
    }
}
