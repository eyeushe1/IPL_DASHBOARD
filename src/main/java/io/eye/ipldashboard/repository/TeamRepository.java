package io.eye.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.eye.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
