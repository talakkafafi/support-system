package com.example.Support.System.entity.support;

import org.springframework.data.jpa.domain.Specification;

public class SupportTicketSpecification {

    public static Specification<SupportTicket> hasCustomerName(String customerName) {
        return (root, query, cb) ->
                (customerName == null || customerName.isBlank())
                        ? null
                        : cb.like(
                        cb.lower(root.get("customerName")),
                        "%" + customerName.toLowerCase() + "%"
                );
    }

    public static Specification<SupportTicket> hasStatus(Status status) {
        return (root, query, cb) ->
                status == null
                        ? null
                        : cb.equal(root.get("status"), status);
    }

    public static Specification<SupportTicket> build(
            String customerName,
            Status status
    ) {
        return Specification.allOf(
                hasCustomerName(customerName),
                hasStatus(status)
        );
    }
}



