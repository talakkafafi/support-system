package com.example.Support.System.controller;

import com.example.Support.System.model.SupportTicketModel;
import com.example.Support.System.service.SupportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/support")
public class SupportController {

    final private SupportService supportService;

    public SupportController(final SupportService supportService) {
        this.supportService = supportService;
    }

    @PostMapping
    public ResponseEntity<SupportTicketModel> createTicket(@RequestBody final SupportTicketModel supportTicketModel) {
        return ResponseEntity.ok(supportService.createTicket(supportTicketModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupportTicketModel> getTicket(@PathVariable final Long id) {
        return ResponseEntity.ok(supportService.getTicket(id));
    }
}

