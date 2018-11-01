package de.bitrecycling.timeshizz.repository;

import de.bitrecycling.timeshizz.model.Project;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

/**
 * The project repository provides persistence the the project model
 *
 * creationTime by robo
 */
public interface ProjectRespository extends ReactiveMongoRepository<Project, String> {
    Flux<Project> findAllByClientId(String clientId);
}
