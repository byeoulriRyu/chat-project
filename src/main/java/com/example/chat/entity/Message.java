package com.example.chat.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chat_message")
public class Message {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "room_id", nullable = false)
    private String roomId;
    
    @Column(name = "content")
    private String content;
    
    @Column(name = "read_flag")
    private String read_flag;
    
    @CreationTimestamp
    @Column(name="create_datetime", insertable=false, updatable = false)
    private Date createDatetime;
}
