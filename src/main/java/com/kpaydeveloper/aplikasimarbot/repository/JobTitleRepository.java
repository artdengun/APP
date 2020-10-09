package com.kpaydeveloper.aplikasimarbot.repository;

import com.kpaydeveloper.aplikasimarbot.model.Client;
import com.kpaydeveloper.aplikasimarbot.model.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {
}
