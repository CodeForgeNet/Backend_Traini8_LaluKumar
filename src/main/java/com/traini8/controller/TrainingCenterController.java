// src/main/java/com/traini8/controller/TrainingCenterController.java
package com.traini8.controller;

import com.traini8.model.TrainingCenter;
import com.traini8.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
@Validated
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService service;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedCenter = service.saveTrainingCenter(trainingCenter);
        return ResponseEntity.ok(savedCenter);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = service.getAllTrainingCenters();
        return ResponseEntity.ok(centers);
    }
}
