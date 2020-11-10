package com.er.cbfapi.services;

import com.er.cbfapi.model.Tecnico;

import java.util.Optional;

public interface TecnicoService {
    Tecnico save(Tecnico tecnico);
    Optional<Tecnico> findById(Long id);
}
