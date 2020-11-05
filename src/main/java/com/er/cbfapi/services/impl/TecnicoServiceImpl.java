package com.er.cbfapi.services.impl;

import com.er.cbfapi.model.Tecnico;
import com.er.cbfapi.repository.TecnicoRepository;
import com.er.cbfapi.services.TecnicoService;
import org.springframework.stereotype.Service;

@Service
public class TecnicoServiceImpl implements TecnicoService {

    private final TecnicoRepository tecnicoRepository;

    public TecnicoServiceImpl(TecnicoRepository tecnicoRepository) {
        this.tecnicoRepository = tecnicoRepository;
    }

    @Override
    public Tecnico save(Tecnico tecnico) {
        return tecnicoRepository.save(tecnico);
    }
}
