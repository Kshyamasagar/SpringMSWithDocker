package com.sagar.firstJobApp.job.Impl;

import com.sagar.firstJobApp.job.Job;
import com.sagar.firstJobApp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                return job;
            }

        }
        return null;
    }

    @Override
    public boolean deleteJobById(Long id) {
        for(Job job:jobs){
            if (job.getId().equals(id)){
                jobs.remove(job);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateJobById(Long id,Job updatedjob) {
        for (Job job : jobs){
            if (job.getId().equals(id)){
                job.setTitle(updatedjob.getTitle());
                job.setDescription(updatedjob.getDescription());
                job.setMinSalary(updatedjob.getMinSalary());
                job.setMaxSalary(updatedjob.getMaxSalary());
                job.setLocation(updatedjob.getLocation());
                return true;
            }

        }
        return false;
    }


}
