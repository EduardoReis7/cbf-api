package com.er.cbfapi.controllers;

import com.er.cbfapi.model.Tecnico;
import com.er.cbfapi.model.dto.TecnicoDto;
import com.er.cbfapi.services.TecnicoService;
import com.er.cbfapi.util.TecnicoUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/tecnico")
public class TecnicoController {

    private final TecnicoService tecnicoService;

    public TecnicoController(TecnicoService tecnicoService) {
        this.tecnicoService = tecnicoService;
    }

    @PostMapping
    public ResponseEntity<Tecnico> cadastrarTecnico(@Valid @RequestBody TecnicoDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tecnicoService.save(TecnicoUtil.convertTecnicoDtoToTecnico(dto)));
    }
}
