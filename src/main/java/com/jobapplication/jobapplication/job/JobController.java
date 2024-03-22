package com.jobapplication.jobapplication.job;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jobapplication.jobapplication.jobService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class JobController {

    private jobService jobService;

    public JobController(jobService jobService) {
        this.jobService = jobService;
    }

    // private List<job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<job> findAll() {
        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody job job) {
        jobService.createJob(job);

        return "Job Added Successfully";
    }

    @GetMapping("/jobs/{id}")
    public job getJobById(@PathVariable Long id) {
        job job = jobService.getJobById(id);
        if (job != null) {
            return job;
        }
        return new job(1L, "Test Job", "Test Job description",
                "2000", "20000", "Test Location");
    }

}
