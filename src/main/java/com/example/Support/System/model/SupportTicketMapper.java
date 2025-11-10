package com.example.Support.System.model;

import com.example.Support.System.entity.support.Status;
import com.example.Support.System.entity.support.SupportTicket;

public class SupportTicketMapper {

    public static SupportTicketModel toModel(SupportTicket ticket) {
        if (ticket == null) return null;

        SupportTicketModel model = new SupportTicketModel();
        model.setId(ticket.getId());
        model.setUserName(ticket.getUserName());
        model.setEmail(ticket.getEmail());
        model.setComments(ticket.getComments());
        model.setStatus(ticket.getStatus() != null ? ticket.getStatus().name() : null);
        return model;
    }

    public static SupportTicket toEntity(SupportTicketModel model) {
        if (model == null) return null;

        SupportTicket ticket = new SupportTicket();
        ticket.setId(model.getId());
        ticket.setUserName(model.getUserName());
        ticket.setEmail(model.getEmail());
        ticket.setComments(String.format("THANK YOU %s. We will check it soon.", model.getUserName()));
        ticket.setStatus(Status.Received);
        return ticket;
    }
}

