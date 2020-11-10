package com.er.cbfapi.services;

import com.er.cbfapi.model.Jogador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface JogadorService {
    Jogador save(Jogador jogador);
    Page<Jogador> findAll(Pageable pageable);
    Optional<Jogador> findById(Long id);
}
