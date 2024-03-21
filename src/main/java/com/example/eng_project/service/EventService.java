package com.example.eng_project.service;

import com.example.eng_project.controller.dto.EventDto;

public interface EventService {
    void create(EventDto event);

    void changeStatus(EventDto event);

    void delete(EventDto event);
}