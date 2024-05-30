package ru.gb.Spring_Test_HW10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.Spring_Test_HW10.model.Task;
import ru.gb.Spring_Test_HW10.model.TaskStatus;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByStatus(TaskStatus status);
}
