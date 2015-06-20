package com.charmyin.employment.model;

import java.util.Date;

public class JobPublish {
    private Integer id;

    private Integer jobId;

    private Integer resumeId;

    private String job;

    private Integer companyId;

    private String jobRequired;

    private Date publishTime;

    private Date huntingTime;

    private String huntingStatus;

    private String publishStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getJobRequired() {
        return jobRequired;
    }

    public void setJobRequired(String jobRequired) {
        this.jobRequired = jobRequired == null ? null : jobRequired.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getHuntingTime() {
        return huntingTime;
    }

    public void setHuntingTime(Date huntingTime) {
        this.huntingTime = huntingTime;
    }

    public String getHuntingStatus() {
        return huntingStatus;
    }

    public void setHuntingStatus(String huntingStatus) {
        this.huntingStatus = huntingStatus == null ? null : huntingStatus.trim();
    }

    public String getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus == null ? null : publishStatus.trim();
    }
}