package com.jobapplication.jobapplication.job.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jobapplication.jobapplication.jobService;
import com.jobapplication.jobapplication.job.job;

@Service

public class jobServiceImpl implements jobService {

    private List<job> jobs = new ArrayList<>();

    private long nextId = 1L;

    @Override
    public List<job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(job job) {
        job.setid(nextId++);
        jobs.add(job);
    }

    @Override
    public job getJobById(Long id) {
        for (job job : jobs) {
            if (id.equals(job.getid())) {
                return job;
            }
        }
        return null;
    }

}
