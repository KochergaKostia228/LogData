package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;
import com.example.demo.models.enums.LogLevel;

@Entity
@Table(name = "log_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LogLevel level;

    @Column(nullable = false)
    private String src;

    @Column(nullable = false)
    private String message;
}
