package com.zs.mokito;

public class Person {

	private Integer personID;
	private String personName;
	
	
	public Person(Integer personID, String personName) {
		super();
		this.personID = personID;
		this.personName = personName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Integer getPersonID() {
		return personID;
	}
	public void setPersonID(Integer personID) {
		this.personID = personID;
	}
}
