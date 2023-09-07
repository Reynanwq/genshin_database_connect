package com.api.genshinimpact.repository;

import com.api.genshinimpact.entities.Potions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotionsRepository extends CrudRepository<Potions, Integer> {
}
