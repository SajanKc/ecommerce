package com.kcsajan.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prd_id", length = 50)
	private int prdId;

	@Column(name = "prd_title", length = 100)
	private String prdTitle;

	@Column(name = "prd_description", length = 3000)
	private String prdDescription;

	@Column(name = "prd_price", length = 10)
	private int prdPrice;

	@Column(name = "prd_discount", length = 10)
	private int prdDiscount;

	@Column(name = "prd_quantity", length = 10)
	private int prdQuantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	public Product() {
		super();
	}

	public Product(int prdId, String prdTitle, String prdDescription, int prdPrice, int prdDiscount, int prdQuantity,
			Category category) {
		super();
		this.prdId = prdId;
		this.prdTitle = prdTitle;
		this.prdDescription = prdDescription;
		this.prdPrice = prdPrice;
		this.prdDiscount = prdDiscount;
		this.prdQuantity = prdQuantity;
		this.category = category;
	}

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdTitle() {
		return prdTitle;
	}

	public void setPrdTitle(String prdTitle) {
		this.prdTitle = prdTitle;
	}

	public String getPrdDescription() {
		return prdDescription;
	}

	public void setPrdDescription(String prdDescription) {
		this.prdDescription = prdDescription;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}

	public int getPrdDiscount() {
		return prdDiscount;
	}

	public void setPrdDiscount(int prdDiscount) {
		this.prdDiscount = prdDiscount;
	}

	public int getPrdQuantity() {
		return prdQuantity;
	}

	public void setPrdQuantity(int prdQuantity) {
		this.prdQuantity = prdQuantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategoryId(Category category) {
		this.category = category;
	}

}
