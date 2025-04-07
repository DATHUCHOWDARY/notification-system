package com.example.notificationsSystem.repository;

import com.example.notificationsSystem.entity.NotificationLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotificationLogRepository extends JpaRepository <NotificationLog, UUID> {
}
