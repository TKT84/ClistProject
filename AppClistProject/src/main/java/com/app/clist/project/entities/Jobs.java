package com.app.clist.project.entities;

public enum Jobs {
    ACCOUNTINGFINANCE("accounting + finance"),
    ADMINISTRATIONOFFICE("administration + office"),
    ARCHITECTUREENGINEERING("architecture + engineering"),
    ARTMEDIADESIGN("art + media + design"),
    BIOTECHSCIENCE("biotechnology + science"),
    BUSINESSMANAGEMENT("business + management"),
    CUSTOMERSERVICE("customer service"),
    EDUCATION("education"),
    FOODBEVERAGEHOSPITALITY("food + beverage + hospitality"),
    GENERALLABOR("general labor"),
    GOVERNMENT("government"),
    HUMANRESOURCES("human resources"),
    INTERNETENGINEERS("internet engineers"),
    LEGALPARALEGAL("legal + paralegal"),
    MANUFACTURING("manufacturing"),
    MARKETINGPUBLICRELATIONSADS("marketing + public relations + ads"),
    MEDICALHEALTH("medical + health"),
    NONPROFITSECTOR("nonprofit sector"),
    REALESTATE("real estate"),
    RETAILWHOLESALE("retail + wholesale"),
    SALESBUSINESSDEVELOPMENT("sales + business development"),
    SALONSPAFITNESS("salon + spa + fitness"),
    SECURITY("security"),
    SKILLEDTRADECRAFT("skilled trade + craft"),
    SOFTWAREQUALITYASSURANCEDATABASEADMINISTRATOR("software + quality assurance / database administrator"),
    SYSTEMSNETWORK("systems + network"),
    TECHNICALSUPPORT("technical support"),
    TRANSPORT("transport"),
    TELEVISIONFILMSVIDEO("television + film + video"),
    WEBINFODESIGN("web design"),
    WRITINGEDITING("writing + editing"),
    OTHER("other"),
    PARTTIME("part-time");
	
	private final String label;

	public String getLabel() {
		return label;
	}

	private Jobs(String label) {
		this.label = label;
	}
	
}
