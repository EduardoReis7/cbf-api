package com.er.cbfapi.util;

import com.er.cbfapi.model.Partida;
import com.er.cbfapi.model.dto.PartidaDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PartidaUtil {

    static ModelMapper modelMapper = new ModelMapper();

    public static Partida convertPartidaDtoToPartida(PartidaDto dto) {
        return modelMapper.map(dto, Partida.class);
    }
    public static PartidaDto convertPartidaToPartidaDto(Partida partida) { return modelMapper.map(partida, PartidaDto.class); }
}
