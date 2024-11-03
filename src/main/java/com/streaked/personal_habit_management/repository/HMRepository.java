package com.streaked.personal_habit_management.repository;

import com.streaked.personal_habit_management.model.Habit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HMRepository extends MongoRepository<Habit, Integer> {

    @Query(value = "{'longestStreak' : { $gt = ?0 , $lt = ?1 }}")
    public List<Habit> findUsersByLongestStreakBetween(Integer low, Integer high);
}
