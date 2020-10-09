package com.kpaydeveloper.aplikasimarbot.repository;

import com.kpaydeveloper.aplikasimarbot.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
