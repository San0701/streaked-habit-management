package com.streaked.personal_habit_management.controller;


import com.streaked.personal_habit_management.model.Habit;
import com.streaked.personal_habit_management.service.HMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streak/habit")

public class HMController {

    @Autowired
    private HMService service;

    @PostMapping("/create")
    public ResponseEntity<Habit> create(@RequestBody Habit dto) {
        return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Habit> find(
            @PathVariable String id) {
        return new ResponseEntity<>(service.find(Integer.valueOf(id)), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Habit>> findAll() {

        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Habit> update(@PathVariable String id, @RequestBody Habit dto) {
        return new ResponseEntity<>(service.update(Integer.valueOf(id), dto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {

        return new ResponseEntity<>(service.delete(Integer.valueOf(id)), HttpStatus.OK);
    }

    @GetMapping("/between/longestStreak")
    public ResponseEntity<List<Habit>> between(@RequestParam Integer min, @RequestParam Integer max) {

        return new ResponseEntity<>(service.findUsersByLongestStreakBetween(min,max), HttpStatus.OK);
    }
}
