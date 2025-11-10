package com.example.Support.System.entity.support;

import com.example.Support.System.entity.ApplicationRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportRepository extends ApplicationRepository<SupportTicket, Long> {
}
