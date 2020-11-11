package com.er.cbfapi.services.impl;

import com.er.cbfapi.model.Partida;
import com.er.cbfapi.model.Placar;
import com.er.cbfapi.repository.PartidaRepository;
import com.er.cbfapi.services.PartidaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PartidaServiceImpl implements PartidaService {

    private final PartidaRepository partidaRepository;

    public PartidaServiceImpl(PartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }

    @Override
    public Partida save(Partida partida) {
        Placar placar = new Placar();
        placar.setGolsTimeCasa(null);
        placar.setGolsTimeVisitante(null);
        partida.setPlacar(placar);
        return partidaRepository.save(partida);
    }

    @Override
    public Page<Partida> findAll(Pageable pageable) {
        return partidaRepository.findAll(pageable);
    }
}
