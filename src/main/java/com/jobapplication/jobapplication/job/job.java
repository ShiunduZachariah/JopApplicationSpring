package com.jobapplication.jobapplication.job;

public class job {

    private long ID;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;

    public job(long ID, String title, String description, String minSalary, String maxSalary, String location) {
        this.ID = ID;
        this.title = title;
        this.description = description;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.location = location;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
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
