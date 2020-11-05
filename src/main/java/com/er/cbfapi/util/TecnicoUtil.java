package com.er.cbfapi.util;

import com.er.cbfapi.model.Tecnico;
import com.er.cbfapi.model.dto.TecnicoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TecnicoUtil {

    private final ModelMapper modelMapper;
    public TecnicoUtil(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Tecnico convertTecnicoDtoToTecnico(TecnicoDto dto) {
        return modelMapper.map(dto, Tecnico.class);
    }
}
