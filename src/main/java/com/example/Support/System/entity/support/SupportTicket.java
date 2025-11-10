package com.example.Support.System.entity.support;

import jakarta.persistence.*;

@Entity
@Table(name = "SUPPORT_TICKET")
public class SupportTicket {
    private Long id;
    private String userName;
    private String email;
    private String comments;
    private Status status;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "support_ticket_seq")
    @SequenceGenerator(name = "support_ticket_seq", sequenceName = "support_ticket_seq", allocationSize = 1)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "Comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
