package com.er.cbfapi.services.impl;

import com.er.cbfapi.model.Jogador;
import com.er.cbfapi.repository.JogadorRepository;
import com.er.cbfapi.services.JogadorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Page<Jogador> findAll(Pageable pageable) {
        return jogadorRepository.findAll(pageable);
    }

    @Override
    public Optional<Jogador> findById(Long id) {
        return jogadorRepository.findById(id);
    }
}
