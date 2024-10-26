package com.streaked.personal_habit_management.repository;

import com.streaked.personal_habit_management.model.entity.Habit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HMRepository extends MongoRepository<Habit, Integer> {
}
