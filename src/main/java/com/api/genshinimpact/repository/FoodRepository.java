package com.api.genshinimpact.repository;

import com.api.genshinimpact.entities.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food, Integer> {
}
