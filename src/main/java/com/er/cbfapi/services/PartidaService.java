package com.er.cbfapi.services;

import com.er.cbfapi.model.Partida;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PartidaService {
    Partida save(Partida partida);
    Page<Partida> findAll(Pageable pageable);
}
