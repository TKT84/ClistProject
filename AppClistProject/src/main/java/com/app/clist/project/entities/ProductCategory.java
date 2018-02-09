package com.app.clist.project.entities;

public enum ProductCategory {

	COMMUNITY("Community"),
	DISCUSSIONSFORUMS("Discussions forums"),
	FORSALE("For sale"),
	GIGS("Gigs"),
	HOUSING("Housing"),
	JOBS("Jobs"),
	PERSONAL("Personal");
	
	private final String label;

	public String getLabel() {
		return label;
	}

	private ProductCategory(String label) {
		this.label = label;
	}
	
}
