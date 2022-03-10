package edu.eci.ieti.Tasks.repository;

import edu.eci.ieti.Tasks.data.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
}