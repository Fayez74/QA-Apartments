package com.qa.apartment.persistance;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name = "apartment_number")
	private String apartmentNum;

	@Column(length = 15)
	private String building;

	@Column(length = 20)
	private String street;

	@Column(length = 20)
	private String city;

	@Column(length = 9)
	private String postCode;

	public Address() {

	}

	public Address(String apartmentNum, String building, String street, String city, String postCode) {
		super();
		this.apartmentNum = apartmentNum;
		this.building = building;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
	}

	public String getApartmentNum() {
		return apartmentNum;
	}

	public void setApartmentNum(String apartmentNum) {
		this.apartmentNum = apartmentNum;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

}
