package edu.eci.ieti.Tasks.repository;

import edu.eci.ieti.Tasks.data.Task;
import edu.eci.ieti.Tasks.dto.TaskDto;
import edu.eci.ieti.Tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceMongoDB implements TaskService {

    private final TaskRepository taskRepository;
    public TaskServiceMongoDB(@Autowired TaskRepository taskRepository )
    {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task task) {
        taskRepository.save(task);
        return null;
    }

    @Override
    public Task findById(String id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public boolean deleteById(String id) {
        try{
            taskRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Task update(TaskDto taskDto, String id) {
        return null;
    }
}