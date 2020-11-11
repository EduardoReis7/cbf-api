package com.er.cbfapi.controllers;

import com.er.cbfapi.model.Time;
import com.er.cbfapi.model.dto.TimeDto;
import com.er.cbfapi.services.TimeService;
import com.er.cbfapi.util.TimeUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @PostMapping
    public ResponseEntity<Time> cadastrarTime(@Valid @RequestBody TimeDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(timeService.save(TimeUtil.convertTimeDtoToTime(dto)));
    }

    @GetMapping
    public ResponseEntity<Page<TimeDto>> listarTimes(Pageable pageable) {
        Page<Time> timePage = timeService.findAll(pageable);
        Page<TimeDto> timeDtoPage = timePage.map(TimeUtil::convertTimeToTimeDto);

        return ResponseEntity.ok(timeDtoPage);
    }
}
