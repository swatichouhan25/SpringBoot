package com.example.demo.bean;

public class StorePractice {
	
	private int productId;
	private String productName;
	private double ProduvtPrice;
	
	public StorePractice() {
		
	}

	public StorePractice(int productId, String productName, double produvtPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		ProduvtPrice = produvtPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProduvtPrice() {
		return ProduvtPrice;
	}

	public void setProduvtPrice(double produvtPrice) {
		ProduvtPrice = produvtPrice;
	}

	@Override
	public String toString() {
		return "StoreData: [productId=" + productId + ", productName=" + productName + ", ProduvtPrice="
				+ ProduvtPrice + "]";
	}
	
	

}
