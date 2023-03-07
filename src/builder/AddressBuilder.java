package builder;

import builder.Address;
import builder.AddressBuilder;

public class AddressBuilder {
	
	private Address address;
	
	private AddressBuilder() {
		address = new Address();
	}
	
	public static AddressBuilder builder() {
		return new AddressBuilder();
	}
	
//	Criando uma classe propria para a construcao da classe Address

	public AddressBuilder city(String city) {
		this.address.setCity(city);
		return this;
	}
	
	public AddressBuilder street(String street) {
		this.address.setStreet(street);
		return this;
	}
	
	public AddressBuilder complement(String complement) {
		this.address.setComplement(complement);
		return this;
	}

	public Address build() {
		return this.address; 
	}
}
