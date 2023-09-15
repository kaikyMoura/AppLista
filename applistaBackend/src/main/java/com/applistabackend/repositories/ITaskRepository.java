package com.applistabackend.repositories;

import com.applistabackend.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskRepository extends MongoRepository<Task, Long> {
}
