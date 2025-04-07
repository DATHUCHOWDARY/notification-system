package com.example.notificationsSystem.repository;

import com.example.notificationsSystem.entity.SystemAlert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SystemAlertRepository extends JpaRepository<SystemAlert, UUID> {
}
