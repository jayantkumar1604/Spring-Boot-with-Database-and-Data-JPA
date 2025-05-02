package com.gfg.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContextRepository extends CrudRepository<Context, Long> {
    // We can add the required methods here
    List<Context> findByContestName(String contestName);
}
