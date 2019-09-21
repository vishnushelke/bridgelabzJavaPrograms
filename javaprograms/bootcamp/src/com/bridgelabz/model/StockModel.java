package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class StockModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Stock> stock = null;
	public List<Stock> getStock() {
		return stock;
	}
	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}
}
