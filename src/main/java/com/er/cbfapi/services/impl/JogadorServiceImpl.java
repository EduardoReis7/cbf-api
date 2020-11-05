package com.er.cbfapi.services.impl;

import com.er.cbfapi.model.Jogador;
import com.er.cbfapi.repository.JogadorRepository;
import com.er.cbfapi.services.JogadorService;
import org.springframework.stereotype.Service;

@Service
public class JogadorServiceImpl implements JogadorService {

    private final JogadorRepository jogadorRepository;

    public JogadorServiceImpl(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    @Override
    public Jogador save(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }
}
