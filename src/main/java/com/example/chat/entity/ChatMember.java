package com.example.chat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chat_member")
public class ChatMember {
    
    @Id
    @Column(name = "room_id", nullable = false)
    private Long roomId;
    
    @Id
    @Column(name = "user_id", updatable = false, nullable = false)
    private Long userId;
    
    @CreationTimestamp
    @Column(name="create_datetime", insertable=false, updatable = false)
    private Date createDatetime;
}
