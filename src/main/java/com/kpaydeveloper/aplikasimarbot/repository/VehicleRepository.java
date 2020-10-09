package com.kpaydeveloper.aplikasimarbot.repository;

import com.kpaydeveloper.aplikasimarbot.model.Client;
import com.kpaydeveloper.aplikasimarbot.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
