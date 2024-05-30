package ru.gb.Spring_Test_HW10.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
@Entity
@EntityListeners(AuditingEntityListener.class)
@RequiredArgsConstructor
@Table(name = "tasks")
@Getter
@Setter
@ToString
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "status")
    private TaskStatus status;
    @Column(name = "date")
    private LocalDate date;

}
