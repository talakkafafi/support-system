package com.example.Support.System.service;

import com.example.Support.System.entity.support.SupportRepository;
import com.example.Support.System.entity.support.SupportTicket;
import com.example.Support.System.model.SupportTicketMapper;
import com.example.Support.System.model.SupportTicketModel;
import org.springframework.stereotype.Service;

@Service
public class SupportService {

    final private SupportRepository supportRepository;

    public SupportService(final SupportRepository supportRepository) {
        this.supportRepository = supportRepository;
    }

    public SupportTicketModel createTicket(SupportTicketModel supportTicketModel) {
        SupportTicket ticketEntity = SupportTicketMapper.toEntity(supportTicketModel);
        return SupportTicketMapper.toModel(supportRepository.save(ticketEntity));
    }

    public SupportTicketModel getTicket(final Long id) {
        return SupportTicketMapper.toModel(supportRepository.getById(id));
    }
}
