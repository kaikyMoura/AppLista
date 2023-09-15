package com.applistabackend.services;

import com.applistabackend.domain.Task;
import com.applistabackend.repositories.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private final ITaskRepository repository;
    public TaskService(ITaskRepository repository) {
        this.repository = repository;
    }

    public Task insert(Task task) {
        return repository.insert(task);
    }

    public List<Task> findAll() {
        return repository.findAll();
    }
}
