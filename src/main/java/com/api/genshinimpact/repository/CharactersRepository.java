package com.api.genshinimpact.repository;

import com.api.genshinimpact.entities.Characters;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharactersRepository extends CrudRepository<Characters, Integer> {

    List<Characters> findByName(String name);
}
