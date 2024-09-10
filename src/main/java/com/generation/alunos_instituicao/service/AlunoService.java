package com.generation.alunos_instituicao.service;

import org.springframework.stereotype.Service;

import com.generation.alunos_instituicao.model.Aluno;
import com.generation.alunos_instituicao.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno criarAluno(Aluno aluno) {
        aluno.setMediaFinal((aluno.getNotaSemestre1() + aluno.getNotaSemestre2()) / 2);
        return repository.save(aluno);
    }

    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Aluno atualizarAluno(Long id, Aluno dadosAtualizados) {
        return repository.findById(id).map(aluno -> {
            aluno.setNomeCompleto(dadosAtualizados.getNomeCompleto());
            aluno.setIdade(dadosAtualizados.getIdade());
            aluno.setNotaSemestre1(dadosAtualizados.getNotaSemestre1());
            aluno.setNotaSemestre2(dadosAtualizados.getNotaSemestre2());
            aluno.setMediaFinal((dadosAtualizados.getNotaSemestre1() + dadosAtualizados.getNotaSemestre2()) / 2);
            return repository.save(aluno);
        }).orElseThrow(() -> new RuntimeException("Aluno não encontrado."));
    }

    public void deletarAluno(Long id) {
        repository.deleteById(id);
    }
}
