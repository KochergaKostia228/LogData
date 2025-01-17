package com.example.demo.services;

import com.example.demo.models.LogData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.LogDataRepository;

import java.util.List;

@Service
public class LogDataServiceImpl implements LogDataService {

    private final LogDataRepository logDataRepository;

    @Autowired
    public LogDataServiceImpl(LogDataRepository logDataRepository) {
        this.logDataRepository = logDataRepository;
    }

    public LogData saveLog(LogData logData) {
        return logDataRepository.save(logData);
    }

    public List<LogData> getLogs(Integer limit) {
        return limit == null ? logDataRepository.findAll() : logDataRepository.findAll().stream().limit(limit).toList();
    }
}
