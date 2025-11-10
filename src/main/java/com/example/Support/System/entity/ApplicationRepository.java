package com.example.Support.System.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository<T, ID> extends JpaRepository<T, ID> {
}
