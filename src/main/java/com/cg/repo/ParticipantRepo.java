package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Participant;

@Repository
public interface ParticipantRepo extends JpaRepository<Participant, Integer> {

}
