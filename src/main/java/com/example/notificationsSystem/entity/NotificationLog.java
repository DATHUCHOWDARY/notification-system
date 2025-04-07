package com.example.notificationsSystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "notification_logs",schema = "gdc_db")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "notification_id",nullable = false)
    private Long notificationId;

    @Column(name = "log_message",nullable = false)
    private String logMessage;

    @Column(name = "logged_at",nullable = false)
    private LocalDateTime loggedAt;

    @Builder.Default
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt =LocalDateTime.now();

    @Builder.Default
    @Column(nullable = false)
    private LocalDateTime updatedAt=LocalDateTime.now();


}
