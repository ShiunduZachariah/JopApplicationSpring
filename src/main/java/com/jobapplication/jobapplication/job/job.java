package com.jobapplication.jobapplication.job;

public class job {

    private long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;

    public job(long id, String title, String description, String minSalary, String maxSalary, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.location = location;
    }

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public String getmaxSalary() {
        return maxSalary;
    }

    public void setmaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getminSalary() {
        return minSalary;
    }

    public void setminSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public String getlocation() {
        return location;
    }

    public void setlocation(String location) {
        this.location = location;
    }

}
