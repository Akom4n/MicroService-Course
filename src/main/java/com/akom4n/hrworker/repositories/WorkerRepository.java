package com.akom4n.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akom4n.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
