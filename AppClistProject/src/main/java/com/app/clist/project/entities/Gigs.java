package com.app.clist.project.entities;

public enum Gigs {

    COMPUTER("computer"),
    CREATIVE("creative"),
    CREW("crew"),
    DOMESTIC("domestic"),
    EVENT("event"),
    LABOR("labor"),
    TALENT("talent"),
    WRITING("writing");
	
	private final String label;

	public String getLabel() {
		return label;
	}

	private Gigs(String label) {
		this.label = label;
	}

} 
