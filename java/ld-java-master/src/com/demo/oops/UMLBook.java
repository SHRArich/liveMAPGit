package com.demo.oops;

public class UMLBook {
//	instance variables
	public String titleString;
	public String authorString;
	public String languageString;
	public float price;
	public boolean available;
	public String genreString;
//	assigning values
	public UMLBook( String titleString, String authorString) {
		this.titleString = titleString;
		this.authorString = authorString;
	}
	public void calculateDiscount(String genreString) {
		if(genreString.equals("fiction"))
			System.err.println("10%");
		else {
			System.err.println("20%");
		}
	}
	public void open() {
	}

	public void read() {
	}

	public void bookmark(int page) {
	}

	public int getCurrentPage() {
		return 0;
	}

	public int close() {
		return 0;
	}

}
