package com.example.notificationsSystem.entity;
import com.example.notificationsSystem.enums.NotificationStatus;
import com.gdc.core_db.enums.admin_panel_enums.NotificationType;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;


import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "notifications",schema = "gdc-db")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id",
                referencedColumnName = "id",
                nullable = false,
                foreignKey = @ForeignKey(name = "fk_notification_user_id")
    )

    private User user;

    @Column(name = "message",nullable = false)
   private String message;

    @Column(name = "notification_type",nullable = false)
    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    @Column(name = "notification_status",nullable = false)
    @Enumerated(EnumType.STRING)
    private NotificationStatus notificationStatus;

    @Column(name = "timestamp",nullable = false)
    private LocalDateTime timestamp;

    @Builder.Default
    @Column(nullable = false)
    private LocalDateTime updatedAt=LocalDateTime.now();

}
