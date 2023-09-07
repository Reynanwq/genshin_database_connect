package com.api.genshinimpact.repository;

import com.api.genshinimpact.entities.Weapons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponsRepository extends CrudRepository<Weapons, Integer> {
}
