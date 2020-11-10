package com.er.cbfapi.controllers;

import com.er.cbfapi.model.Jogador;
import com.er.cbfapi.model.dto.JogadorDto;
import com.er.cbfapi.services.JogadorService;
import com.er.cbfapi.util.JogadorUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public ResponseEntity<Jogador> cadastrarJogador(@Valid @RequestBody JogadorDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorService.save(JogadorUtil.convertJogadorDtoToJogador(dto)));
    }

    @GetMapping
    public ResponseEntity<Page<JogadorDto>> buscarTodosJogadores(Pageable pageable) {
        Page<Jogador> jogadorPage = jogadorService.findAll(pageable);
        Page<JogadorDto> jogadorDtoPage = jogadorPage.map(JogadorUtil::convertJogadorToJogadorDto);

        return ResponseEntity.ok(jogadorDtoPage);
    }
}
