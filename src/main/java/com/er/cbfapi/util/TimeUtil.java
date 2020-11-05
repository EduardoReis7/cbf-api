package com.er.cbfapi.util;

import com.er.cbfapi.model.Time;
import com.er.cbfapi.model.dto.TimeDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TimeUtil {

    private final ModelMapper modelMapper;

    public TimeUtil(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Time convertTimeDtoToTime(TimeDto dto) {
        return modelMapper.map(dto, Time.class);
    }
}
