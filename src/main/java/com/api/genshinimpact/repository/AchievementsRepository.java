package com.api.genshinimpact.repository;
import com.api.genshinimpact.entities.Achievements;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementsRepository extends CrudRepository<Achievements, Integer>{
}
