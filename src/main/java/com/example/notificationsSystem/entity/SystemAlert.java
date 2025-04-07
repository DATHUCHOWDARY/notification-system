package com.example.notificationsSystem.entity;

import com.gdc.core_db.enums.notification_system_enums.SeverityLevel;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "system_alerts",schema = "gdc_db")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SystemAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "alert_message",nullable = false)
    private String alertMessage;

    @Column(name = "severity",nullable = false)
    @Enumerated(EnumType.STRING)
    private SeverityLevel severity;

    @Column(name = "created_at",nullable = false)
    private LocalDateTime createdAt;
    @Builder.Default
    @Column(nullable = false)
    private LocalDateTime updatedAt=LocalDateTime.now();

}
