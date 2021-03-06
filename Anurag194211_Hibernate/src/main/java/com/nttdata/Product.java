package com.nttdata;

import java.util.Set;

public class Product {

	 private long id;
	 private String name;
	 private String description;
	 private float price;
     private Category category;
	 
	    public Product() {
	    }

		public Product(String name, String description, float price, Category category) {
			super();
			this.name = name;
			this.description = description;
			this.price = price;
			this.category = category;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
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

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		@Override
		public String toString() {
			return "\nProduct [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price+ "]";
		}

		
}
