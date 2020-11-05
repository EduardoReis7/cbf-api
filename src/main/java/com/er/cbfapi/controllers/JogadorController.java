package com.er.cbfapi.controllers;

import com.er.cbfapi.model.Jogador;
import com.er.cbfapi.model.dto.JogadorDto;
import com.er.cbfapi.services.JogadorService;
import com.er.cbfapi.util.JogadorUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private final JogadorService jogadorService;
    private final JogadorUtil jogadorUtil;

    public JogadorController(JogadorService jogadorService, JogadorUtil jogadorUtil) {
        this.jogadorService = jogadorService;
        this.jogadorUtil = jogadorUtil;
    }

    @PostMapping
    public ResponseEntity<Jogador> cadastrarJogador(@Valid @RequestBody JogadorDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorService.save(jogadorUtil.convertJogadorDtoToJogador(dto)));
    }
}
