package com.cos.product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**hibernate will automatically translate this Entity into a table*/
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String productName;
	private String brand;
	private double price;
	void setProductName(String name) {
		this.productName=name;
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
	void setPrice(double price) {
		this.price=price;
	}
	String getProductName() {
		return productName;
	}
	String getBrand() {
		return brand;
	}
	double getPrice() {
		return price;
	}
}
