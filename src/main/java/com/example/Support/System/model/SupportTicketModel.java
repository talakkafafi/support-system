package com.example.Support.System.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupportTicketModel {

    private Long id;
    private String userName;
    private String email;
    private String comments;
    private String status;
}
