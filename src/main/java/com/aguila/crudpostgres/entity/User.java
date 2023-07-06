package com.aguila.crudpostgres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ea_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;

    @Column(name = "email", columnDefinition = "varchar(100)")
    private String email;

    @Column(name = "pass", columnDefinition = "varchar(100)")
    private String pass;
}
