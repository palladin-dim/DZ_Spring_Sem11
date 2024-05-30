package ru.gb.Spring_Test_HW10.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.Spring_Test_HW10.model.Task;
import ru.gb.Spring_Test_HW10.model.TaskStatus;
import ru.gb.Spring_Test_HW10.repository.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    //add Task
    public void addTask(Task task){
        taskRepository.save(task);
    }
    //all Tasks
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    //find by ID
    public Task findById(Long id) {
        return taskRepository.findById(id).orElseThrow();
    }
    //list by status
    public List<Task> getTasksByStatus(TaskStatus status){
        return taskRepository.findAllByStatus(status);
    }
    //update status
    public void updateTaskStatus(Task task){
        taskRepository.save(task);
    }
    //delete by ID
    public void deleteTaskById(Long id){
        taskRepository.deleteById(id);
    }

}
