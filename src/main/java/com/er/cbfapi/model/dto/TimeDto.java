package com.er.cbfapi.model.dto;

import com.er.cbfapi.model.Jogador;
import com.er.cbfapi.model.Tecnico;

import java.time.LocalDate;
import java.util.List;

public class TimeDto {

    private Long id;
    private String nome;
    private LocalDate dataFundacao;
    private Tecnico tecnico;
    private List<Jogador> listaJogadores;

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

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(List<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }
}
