package com.er.cbfapi.util;

import com.er.cbfapi.model.Tecnico;
import com.er.cbfapi.model.dto.TecnicoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public abstract class TecnicoUtil {

    static ModelMapper modelMapper = new ModelMapper();
    public static Tecnico convertTecnicoDtoToTecnico(TecnicoDto dto) {
        return modelMapper.map(dto, Tecnico.class);
    }
}
