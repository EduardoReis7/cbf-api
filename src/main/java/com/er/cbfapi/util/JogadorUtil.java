package com.er.cbfapi.util;

import com.er.cbfapi.model.Jogador;
import com.er.cbfapi.model.dto.JogadorDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class JogadorUtil {

    private final ModelMapper modelMapper;

    public JogadorUtil(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Jogador convertJogadorDtoToJogador(JogadorDto dto) {
        return modelMapper.map(dto, Jogador.class);
    }
}
