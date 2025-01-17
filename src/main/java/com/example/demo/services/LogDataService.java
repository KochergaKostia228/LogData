package com.example.demo.services;

import com.example.demo.models.LogData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogDataService {
    LogData saveLog(LogData logData);
    List<LogData> getLogs(Integer limit);
}
