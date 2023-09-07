package com.api.genshinimpact.repository;

import com.api.genshinimpact.entities.Updates;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdatesRepository extends CrudRepository<Updates, Integer> {
}
