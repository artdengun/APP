package com.kpaydeveloper.aplikasimarbot.repository;

import com.kpaydeveloper.aplikasimarbot.model.Client;
import com.kpaydeveloper.aplikasimarbot.model.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {
}
