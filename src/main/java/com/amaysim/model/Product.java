package com.amaysim.model;

/**
 * Products - Data plans.
 * 
 * @author joyce
 *
 */
public class Product {
	
	private int Id;
	
	private String code;
	
	private String name;
	
	private String description;
	
	private Double price;
	
	private int expiry;
	
	private boolean isPlan;
	
	private boolean isUnlimited;
	
	private int sizeMb;
	
	private String termsUrl;
	
	private String infoUrl;
	
	public Product(){
	}
	
	public Product(int id, String code, String name, String description, Double price, int expiry, boolean isPlan,
			boolean isUnlimited, int sizeMb, String termsUrl, String infoUrl) {
		super();
		Id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.expiry = expiry;
		this.isPlan = isPlan;
		this.isUnlimited = isUnlimited;
		this.sizeMb = sizeMb;
		this.termsUrl = termsUrl;
		this.infoUrl = infoUrl;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getExpiry() {
		return expiry;
	}

	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}

	public boolean isPlan() {
		return isPlan;
	}

	public void setPlan(boolean isPlan) {
		this.isPlan = isPlan;
	}

	public boolean isUnlimited() {
		return isUnlimited;
	}

	public void setUnlimited(boolean isUnlimited) {
		this.isUnlimited = isUnlimited;
	}

	public int getSizeMb() {
		return sizeMb;
	}

	public void setSizeMb(int sizeMb) {
		this.sizeMb = sizeMb;
	}

	public String getTermsUrl() {
		return termsUrl;
	}

	public void setTermsUrl(String termsUrl) {
		this.termsUrl = termsUrl;
	}

	public String getInfoUrl() {
		return infoUrl;
	}

	public void setInfoUrl(String infoUrl) {
		this.infoUrl = infoUrl;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", expiry=" + expiry + ", isPlan=" + isPlan + ", isUnlimited=" + isUnlimited + ", sizeMb=" + sizeMb
				+ ", termsUrl=" + termsUrl + ", infoUrl=" + infoUrl + "]";
	}
	
	
}
