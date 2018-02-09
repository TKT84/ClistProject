package com.app.clist.project.entities;

public enum Services {



    AUTOMOTIVE("automotive"),
    BEAUTYANDHEALTH("beauty + health"),
    CELLPHONE("cell phones"),
    COMPUTERS("computers"),
    CREATIVE("creative"),
    CYCLES("cycles"),
    
    EVENT("event"),
    FARMANDGARDEN("farm + garden"),
    FINANCIAL("financial"),
    HOUSEHOLD("household"),
    LABORANDMOVE("labor + move"),
    LEGAL("LEGAL"),
    LESSONS("lessons"),
    MARINE("marine"),
    PETS("pets"),
    REALESTATE("real estate"),
    SKILLEDTRADE("skilled trade"),
    SMALLBUSINESSADS("small business ads"),
    THERAPEUTIC("therapeutic"),
    TRAVEL("travel + vacation"),
    WRITINGANDEDITIONANDTRANSLATION("write + edit + translate");
	
	 private final String label;

		private Services(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}
}
