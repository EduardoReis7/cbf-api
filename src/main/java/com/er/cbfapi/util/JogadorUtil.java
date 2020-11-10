package com.er.cbfapi.util;

import com.er.cbfapi.model.Jogador;
import com.er.cbfapi.model.dto.JogadorDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public abstract class JogadorUtil {

    static ModelMapper modelMapper = new ModelMapper();

    public static Jogador convertJogadorDtoToJogador(JogadorDto dto) {
        return modelMapper.map(dto, Jogador.class);
    }
    public static JogadorDto convertJogadorToJogadorDto(Jogador jogador) {
        return modelMapper.map(jogador, JogadorDto.class);
    }
}
