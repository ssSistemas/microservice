package com.ss.microservice.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ss.microservice.task.enty.Task;

@RepositoryRestResource(path="task",collectionResourceRel = "tasks")

public interface TaskRepository extends JpaRepository<Task, Integer> {
	

}
