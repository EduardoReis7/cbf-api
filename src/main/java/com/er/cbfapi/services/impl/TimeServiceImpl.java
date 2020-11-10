package com.er.cbfapi.services.impl;

import com.er.cbfapi.model.Time;
import com.er.cbfapi.repository.TimeRepository;
import com.er.cbfapi.services.TimeService;
import org.springframework.stereotype.Service;

@Service
public class TimeServiceImpl implements TimeService {

    private final TimeRepository timeRepository;

    public TimeServiceImpl(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    @Override
    public Time save(Time time) {
        return timeRepository.save(time);
    }

}
