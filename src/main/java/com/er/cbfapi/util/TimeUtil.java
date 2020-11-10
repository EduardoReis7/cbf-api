package com.er.cbfapi.util;

import com.er.cbfapi.model.Jogador;
import com.er.cbfapi.model.Tecnico;
import com.er.cbfapi.model.Time;
import com.er.cbfapi.model.dto.TimeDto;
import com.er.cbfapi.services.JogadorService;
import com.er.cbfapi.services.TecnicoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public abstract class TimeUtil {

    public static Time convertTimeDtoToTime(TimeDto dto) {

        Time time = new Time();
        time.setId(dto.getId());
        time.setNome(dto.getNome());
        time.setDataFundacao(dto.getDataFundacao());

        time.setListaJogadores(dto.getListaJogadores().stream().map(jogadorDto -> JogadorUtil.convertJogadorDtoToJogador(jogadorDto))
                .collect(Collectors.toList()));

        time.setTecnico(TecnicoUtil.convertTecnicoDtoToTecnico(dto.getTecnicoDto()));

        return time;
    }

}
