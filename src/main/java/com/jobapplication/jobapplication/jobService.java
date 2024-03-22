package com.jobapplication.jobapplication;

import java.util.List;

import com.jobapplication.jobapplication.job.job;

public interface jobService {

    List<job> findAll();

    void createJob(job job);

    job getJobById(Long id);

}
