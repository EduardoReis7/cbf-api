package com.er.cbfapi.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class JogadorDto {

    private Long id;
    private String nome;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate dataNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
