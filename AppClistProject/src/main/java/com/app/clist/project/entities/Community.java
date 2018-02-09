package com.app.clist.project.entities;

public enum Community {

    ACTIVITIES("activities"),
    ARTISTS("artists"),
    CHILDCARE("childcare"),
    CLASSES("classes"),
    EVENTS("events"),
    GENERAL("general"),
    GROUPS("groups"),
    LOCALNEWS("local news"),
    LOSTANDFOUND("lost and found"),
    MUSICIANS("musicians"),
    PETS("pets"),
    POLITICS("politics"),
    RIDESHARE("rideshare"),
    VOLUNTEERS("volunteers");

	private final String label;

	public String getLabel() {
		return label;
	}

	private Community(String label) {
		this.label = label;
	}
	
	

}
