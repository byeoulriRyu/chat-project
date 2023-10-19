package com.example.chat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "message_check")
public class MessageCheck {
    
    @Id
    @Column(name = "message_id", nullable = false)
    private Long message_id;
    
    @Column(name = "member_id", nullable = false)
    private Long member_id;
    
    @CreationTimestamp
    @Column(name="create_datetime", insertable=false, updatable = false)
    private Date createDatetime;
    
}
