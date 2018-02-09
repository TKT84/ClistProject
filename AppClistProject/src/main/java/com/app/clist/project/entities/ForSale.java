package com.app.clist.project.entities;

public enum ForSale {


    ANTIQUES("antiques"),
    APPLIANCES("appliances"),
    ARTSANDCRAFT("arts + crafts"),
    AUTOPARTS("auto parts"),
    BABYANDKIDSTUFF("baby stuff + kid stuff"),
    BARTER("barter"),
    BEAUTYANDHEALTH("beauty + health"),
    BIKES("bikes"),
    BOATS("boats"),
    BOOKS("books"),
    BUSINESS("business"),
    CARSANDTRUCKS("cars + trucks"),
    CDSANDDVDANDVHS("cds + dvd + vhs"),
    CELLPHONE("cell phones"),
    CLOTHESANDACCESSORIES("clothes + accessories"),
    COLLECTIBLES("collectibles"),
    COMPUTERS("computers"),
    ELECTRONICS("electronics"),
    FARMANDGARDEN("farm + garden"),
    FREE("free"),
    FURNITURES("furniture"),
    GARAGESALE("garage sale"),
    GENERAL("general"),
    HEAVYEQUIPMENT("heavy equipment"),
    HOUSEHOLD("household"),
    JEWELRY("jewelry"),
    MATERIALS("materials"),
    MOTORCYCLES("motorcycles"),
    MUSICALINSTRUMENTS("musical instruments"),
    PHOTOANDVIDEO("photo + video"),
    SPORTINGGOODS("sporting goods"),
    TICKETS("tickets"),
    TOOLS("tools"),
    TOYSANDGAMES("toys + games"),
    TRAILERS("trailers"),
    VIDEOGAMING("video gaming"),
    WANTED("wanted");

	 private final String label;

		private ForSale(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}
}
