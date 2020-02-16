package com.dellife.event;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event event1 = Event.builder()
                .name("스프링 웹 MVC 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2020, 1, 28, 0, 0, 0))
                .endDateTime(LocalDateTime.of(2020, 1, 28, 12, 0, 0))
                .build();

        Event event2 = Event.builder()
                .name("스프링 웹 MVC 스터디 2차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2020, 1, 29, 0, 0, 0))
                .endDateTime(LocalDateTime.of(2020, 1, 29, 12, 0, 0))
                .build();

        return Arrays.asList(event1, event2);
    }
}
