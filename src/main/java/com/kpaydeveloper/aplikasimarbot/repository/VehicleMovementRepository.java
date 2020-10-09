package com.kpaydeveloper.aplikasimarbot.repository;

import com.kpaydeveloper.aplikasimarbot.model.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {
}
