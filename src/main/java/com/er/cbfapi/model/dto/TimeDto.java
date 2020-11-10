package com.er.cbfapi.model.dto;

import com.er.cbfapi.model.Tecnico;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;

public class TimeDto {

    private Long id;
    private String nome;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate dataFundacao;
    private TecnicoDto tecnicoDto;
    private List<JogadorDto> listaJogadores;

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

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public TecnicoDto getTecnicoDto() {
        return tecnicoDto;
    }

    public void setTecnicoDto(TecnicoDto tecnicoDto) {
        this.tecnicoDto = tecnicoDto;
    }

    public List<JogadorDto> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(List<JogadorDto> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }
}
