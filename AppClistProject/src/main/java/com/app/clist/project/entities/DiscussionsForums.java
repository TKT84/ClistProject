package com.app.clist.project.entities;

public enum DiscussionsForums {


    APPLE("apple"),
    ARTS("arts"),
    ATHEIST("atheist"),
    AUTOS("autos"),
    BEAUTY("beauty"),
    BIKES("bikes"),
    CELEBRITIES("celebs"),
    COMPUTERS("computers"),
    CRAFTS("crafts"),
    DIET("diet"),
    DIVORCE("divorce"),
    DYING("dying"),
    ECOLOGY("ecology"),
    EDUCATION("education"),
    FEEDBACK("feedback"),
    FILM("film"),
    FITNESS("fitness"),
    FIXIT("fixit"),
    FOOD("food"),
    FRUGAL("frugal"),
    GAMING("gaming"),
    GARDEN("garden"),
    HAIKU("haiku"),
    HELP("help"),
    HISTORY("history"),
    HOUSING("housing"),
    JOBS("jobs"),
    JOKES("jokes"),
    KINK("kink"),
    LEGAL("LEGAL"),
    LINUX("linux"),
    MANNERS("manners"),
    MARRIAGE("marriage"),
    MEDIA("media"),
    MONEY("money"),
    MOTORCYCLE("motorcycle"),
    MUSIC("music"),
    NONPROFIT("nonprofit"),
    OPEN("open"),
    OUTDOOR("outdoor"),
    OVER50("over 50"),
    PARENT("parent"),
    PETS("pets"),
    PHILOSOPHY("philosophy"),
    PHOTOGRAPHY("photo"),
    PEOPLEOFCOLOR("people of color"),
    POLITICS("politics"),
    PSYCHOLOGY("psychology"),
    RECOVER("recover"),
    RELIGION("religion"),
    ROMANCE("romance"),
    SCIENCE("science"),
    SPIRIT("spirit"),
    SPORTS("sports"),
    TAX("tax"),
    TRAVEL("travel"),
    TELEVISION("television"),
    	WEDDING("wedding"),
    WOMEN("women"),
    WRITING("writing");
    
    private final String label;

	private DiscussionsForums(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	
}
