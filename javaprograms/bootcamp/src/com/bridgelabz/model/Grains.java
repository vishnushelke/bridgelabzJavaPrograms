package com.bridgelabz.model;

public class Grains {
	private String name;
	private int weight;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Grains [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	

}
