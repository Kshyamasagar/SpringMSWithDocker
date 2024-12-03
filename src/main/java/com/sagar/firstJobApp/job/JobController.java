package com.sagar.firstJobApp.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    private List<Job> jobs = new ArrayList<>();

    //Get list of all the jobs
    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }
}
