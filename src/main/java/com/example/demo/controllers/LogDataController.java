package com.example.demo.controllers;

import com.example.demo.models.LogData;
import com.example.demo.services.LogDataServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.LogDataService;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
@AllArgsConstructor
public class LogDataController {

    private final LogDataService logDataService;

    /**
     * Save new entry of log
     *
     * @param logData data of log
     * @return ID of created entry
     */
    @PostMapping
    public ResponseEntity<?> createLog(@RequestBody LogData logData) {
        LogData savedLog = logDataService.saveLog(logData);
        return ResponseEntity.ok().body("{\"id\":" + savedLog.getId() + "}");
    }

    /**
     * Get list of logs
     *
     * @param limit number of logs
     * @return list of logs
     */
    @GetMapping
    public ResponseEntity<List<LogData>> getLogs(@RequestParam(value = "limit", required = false) Integer limit) {
        return ResponseEntity.ok(logDataService.getLogs(limit));
    }
}