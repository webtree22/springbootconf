package com.sudeepgurung.confdemo.repositories;

import com.sudeepgurung.confdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
