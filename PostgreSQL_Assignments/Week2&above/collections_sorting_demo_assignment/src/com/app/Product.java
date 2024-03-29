package com.app;

public class Product implements Comparable<Product>{

	private int id;
	private String name;
	private double cost;
	private float ratings;
	private boolean available;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double cost, float ratings, boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.ratings = ratings;
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", ratings=" + ratings + ", available="
				+ available + "]";
	}

	@Override
	public int compareTo(Product o) {
		Integer id1=this.id;
		Integer id2=o.id;
		
		return id1.compareTo(id2);
	}
	
}
