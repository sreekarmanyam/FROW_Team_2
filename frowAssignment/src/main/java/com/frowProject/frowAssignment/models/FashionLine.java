package com.frowProject.frowAssignment.models;

public class FashionLine {

    private Integer id;
    //not sure if these two are correct
    private Integer designerId;
    private String designer;
    private String title;
	private Double price;
    private String lineSummary;

	public FashionLine(Integer id, Integer designerId, String designer, String title, Double price,
			String lineSummary) {
        this.id = id;
        this.designerId = designerId;
        this.designer = designer;
        this.title = title;
        this.price = price;
        this.lineSummary = lineSummary;
    }

	public FashionLine(Integer id, Integer designerId, String designer, String title, Double price) {
		this.id = id;
		this.designerId = designerId;
		this.designer = designer;
		this.title = title;
		this.price = price;
	}

    public Integer getId() {
        return id;
    }

    public Integer getDesignerId() {
        return designerId;
    }

    public String getDesigner() {
        return designer;
    }

    public String getTitle() {
        return title;
    }

	public Double getPrice() {
        return price;
    }

    public String getLineSummary() {
        return lineSummary;
    }
}

