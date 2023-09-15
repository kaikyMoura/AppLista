package com.applistabackend.controllers;

import com.applistabackend.domain.Task;
import com.applistabackend.services.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Api de task")
@RestController
@RequestMapping(name = "/task")
public class TaskController {

    @Autowired
    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @ApiOperation(value = "Retorna todas as tasks")
    @GetMapping(name = "/findAll")
    public ResponseEntity<List<Task>> findAll() {
        return ResponseEntity.ok().body(taskService.findAll());
    }

    @ApiOperation(value = "Salva uma task no banco")
    @PostMapping(name = "/insert")
    public ResponseEntity<Task> insert(Task task) {
        return ResponseEntity.ok().body(taskService.insert(task));
    }
}