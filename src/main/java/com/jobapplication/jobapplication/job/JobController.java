package com.jobapplication.jobapplication.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    private List<job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<job> findAll() {
        return jobs;
    }

}
