package com.er.cbfapi.services;

import com.er.cbfapi.model.Time;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TimeService {
    Time save(Time time);
    Page<Time> findAll(Pageable pageable);
}
