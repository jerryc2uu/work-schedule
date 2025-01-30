package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "schedules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // 근무하는 직원

    @ManyToOne
    @JoinColumn(name = "shift_id", nullable = false)
    private Shift shift; // 근무 유형

    @Column(nullable = false)
    private LocalDate workDate; // 근무 날짜
    
}
