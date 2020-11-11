package com.er.cbfapi.controllers;

import com.er.cbfapi.model.Partida;
import com.er.cbfapi.model.dto.PartidaDto;
import com.er.cbfapi.services.PartidaService;
import com.er.cbfapi.util.PartidaUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/partida")
public class PartidaController {

    private final PartidaService partidaService;

    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @PostMapping
    public ResponseEntity<Partida> cadastrarPartidia(@Valid @RequestBody PartidaDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(partidaService.save(PartidaUtil.convertPartidaDtoToPartida(dto)));
    }

    @GetMapping
    public ResponseEntity<Page<PartidaDto>> listarPartidas(Pageable pageable) {
        Page<Partida> partidaPage = partidaService.findAll(pageable);
        Page<PartidaDto> partidaDtoPage = partidaPage.map(PartidaUtil::convertPartidaToPartidaDto);

        return ResponseEntity.ok(partidaDtoPage);
    }
}
