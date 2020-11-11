package com.er.cbfapi.util;

import com.er.cbfapi.model.Time;
import com.er.cbfapi.model.dto.TimeDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public abstract class TimeUtil {

    public static Time convertTimeDtoToTime(TimeDto dto) {

        Time time = new Time();
        time.setId(dto.getId());
        time.setNome(dto.getNome());
        time.setDataFundacao(dto.getDataFundacao());

        time.setListaJogadores(dto.getListaJogadoresDto().stream().map(jogadorDto -> JogadorUtil.convertJogadorDtoToJogador(jogadorDto))
                .collect(Collectors.toList()));

        time.setTecnico(TecnicoUtil.convertTecnicoDtoToTecnico(dto.getTecnicoDto()));

        return time;
    }

    public static TimeDto convertTimeToTimeDto(Time time) {

        TimeDto dto = new TimeDto();
        dto.setId(time.getId());
        dto.setNome(time.getNome());
        dto.setDataFundacao(time.getDataFundacao());

        dto.setListaJogadoresDto(time.getListaJogadores().stream().map(jogador -> JogadorUtil.convertJogadorToJogadorDto(jogador))
                .collect(Collectors.toList()));

        dto.setTecnicoDto(TecnicoUtil.convertTecnicoToTecnicoDto(time.getTecnico()));

        return dto;
    }

}
