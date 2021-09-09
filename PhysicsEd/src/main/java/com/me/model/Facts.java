package com.me.model;


//introduce database annotations when database is ready
public class Facts {
	//introduce generated id stuff here when database is ready
	
	private String nameOfFact;
	private String factDescription;
	
	public Facts() {
		super();
	}
	
	public Facts(String nameOfFact, String factDescription) {
		super();
		this.nameOfFact=nameOfFact;
		this.factDescription=factDescription;
	}

	public String getNameOfFact() {
		return nameOfFact;
	}

	public void setNameOfFact(String nameOfFact) {
		this.nameOfFact = nameOfFact;
	}

	public String getFactDescription() {
		return factDescription;
	}

	public void setFactDescription(String factDescription) {
		this.factDescription = factDescription;
	}
	
	

}
