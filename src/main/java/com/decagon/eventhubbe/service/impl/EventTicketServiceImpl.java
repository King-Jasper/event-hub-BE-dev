package com.decagon.eventhubbe.service.impl;

import com.decagon.eventhubbe.domain.entities.AppUser;
import com.decagon.eventhubbe.domain.entities.Event;
import com.decagon.eventhubbe.domain.entities.EventTicket;
import com.decagon.eventhubbe.domain.repository.AppUserRepository;
import com.decagon.eventhubbe.domain.repository.EventRepository;
import com.decagon.eventhubbe.domain.repository.EventTicketRepository;
import com.decagon.eventhubbe.service.EventTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventTicketServiceImpl implements EventTicketService {

    private final EventTicketRepository eventTicketRepository;
    private final AppUserRepository appUserRepository;

    @Override
    public EventTicket findEventByTicket(String ticketId) {
        EventTicket eventTicket = eventTicketRepository.findEventTicketByTicketNumber(ticketId).orElse(null);
        if (eventTicket == null) {
            return null;
        }
        return eventTicket;
    }

}
