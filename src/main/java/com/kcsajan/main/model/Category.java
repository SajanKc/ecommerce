package com.kcsajan.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id", length = 10)
	private int categoryId;

	@Column(name = "category_title", length = 150)
	private String categoryTitle;

	@Column(name = "category_description", length = 500)
	private String categoryDescription;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
	private List<Product> products = new ArrayList<>();

	public Category() {
		super();
	}

	public Category(String categoryTitle, String categoryDescription, List<Product> products) {
		super();
		this.categoryTitle = categoryTitle;
		this.categoryDescription = categoryDescription;
		this.products = products;
	}

	public Category(int categoryId, String categoryTitle, String categoryDescription, List<Product> products) {
		super();
		this.categoryId = categoryId;
		this.categoryTitle = categoryTitle;
		this.categoryDescription = categoryDescription;
		this.products = products;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
