package com.frowProject.frowAssignment.models;

public class Designer {

    private Integer id;
    private String name;
    private String summary;
    private String location;

    public Designer(Integer id, String name, String summary, String location) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public String getLocation() {
        return location;
    }

}
