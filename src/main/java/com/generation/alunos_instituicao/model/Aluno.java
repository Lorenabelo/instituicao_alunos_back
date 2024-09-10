package com.generation.alunos_instituicao.model;

import jakarta.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomeCompleto;
    private Integer idade;
    private Double notaSemestre1;
    private Double notaSemestre2;
    private Double mediaFinal;


    public Aluno() {
    }

    public Aluno(String nomeCompleto, Integer idade, Double notaSemestre1, Double notaSemestre2, Double mediaFinal) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.notaSemestre1 = notaSemestre1;
        this.notaSemestre2 = notaSemestre2;
        this.mediaFinal = mediaFinal;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getNotaSemestre1() {
        return notaSemestre1;
    }

    public void setNotaSemestre1(Double notaSemestre1) {
        this.notaSemestre1 = notaSemestre1;
    }

    public Double getNotaSemestre2() {
        return notaSemestre2;
    }

    public void setNotaSemestre2(Double notaSemestre2) {
        this.notaSemestre2 = notaSemestre2;
    }

    public Double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(Double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
}
