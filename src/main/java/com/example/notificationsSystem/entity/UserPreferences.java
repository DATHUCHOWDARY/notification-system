package com.example.notificationsSystem.entity;

import com.gdc.core_db.domain.entity.user_registration_db.User;
import com.gdc.core_db.enums.admin_panel_enums.NotificationType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "user_preference",schema = "gdc_db")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPreferences {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_user_preferences_user_id")
    )
    private User user;
    @Column(name = "preferred_notification_type",nullable = false)
    @Enumerated(EnumType.STRING)
    private NotificationType preferredNotificationType;

    @Builder.Default
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt=LocalDateTime.now();

    @Builder.Default
    @Column(nullable = false)
    private LocalDateTime updatedAt=LocalDateTime.now();

}
