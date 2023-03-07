package builder;

import builder.Address;

public class Address {
	
	private String city;
	private String street;
	private String complement;
	
	protected Address() {
	}

	public static Address builder() {
		return new Address();
	}
	
//	Construindo um pattern builder dentro da propria classe
//
//
//	public Address city(String city) {
//		this.city = city;
//		return this;
//	}
	
//	public Address street(String street) {
//		this.street = street;
//		return this;
//	}
	
//	public Address complement(String complement) {
//		this.complement = complement;
//		return this;
//	}

	protected void setCity(String city) {
		this.city = city;
	}
	
	protected void setStreet(String street) {
		this.street = street;
	}

	protected void setComplement(String complement) {
		this.complement = complement;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", complement=" + complement + "]";
	}
	
}
