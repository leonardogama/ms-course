package com.lng.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lng.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
	

}
