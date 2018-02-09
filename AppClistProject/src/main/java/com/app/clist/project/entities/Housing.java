package com.app.clist.project.entities;

public enum Housing {

    APARTMENTSHOUSING("apts + housing"),
    HOUSINGSWAP("housing swap"),
    HOUSINGWANTED("housing wanted"),
    OFFICECOMMERCIAL("office + commercial"),
    PARKINGSTORAGE("parking + storage"),
    REALESTATEFORSALE("real estate for sale"),
    ROOMS("rooms + shared"),
    ROOMSWANTED("rooms wanted"),
    SUBLET("sublets + temporary"),
    VACATIONRENTALS("vacation + rentals");
	
	private final String label;

	public String getLabel() {
		return label;
	}

	private Housing(String label) {
		this.label = label;
	}

}
