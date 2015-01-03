package net.javabeat.springdata.jpa.data;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/*
@author mesuta
@since 2.1.2015
 @param Id 
@param addressCountry
@param addresscity
*/


@Document
public class Address {
	@Id
	private BigInteger id;
	private String addressCountry;
	private String addressCity;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getAddressCountry() {
		return addressCountry;
	}
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
}
