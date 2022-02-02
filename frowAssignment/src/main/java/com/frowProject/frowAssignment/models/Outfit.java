package com.frowProject.frowAssignment.models;

public class Outfit {

    private Integer id;
    private Integer lineId;
    private Integer designerId;
    private String title;
    private String description;
    private Integer price;

    public Outfit(Integer id, Integer lineId, Integer designerId, String title, String description, Integer price) {
        this.id = id;
        this.lineId = lineId;
        this.designerId = designerId;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Integer getLineId() {
        return lineId;
    }

    public Integer getDesignerId() {
        return designerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }
}
