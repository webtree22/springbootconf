package com.sudeepgurung.confdemo.repositories;

import com.sudeepgurung.confdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
