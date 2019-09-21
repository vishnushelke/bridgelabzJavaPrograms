package com.bridgelabz.model;

public class Stock {
	private String stockName;
	private Integer numberOfShare;
	private Integer sharePrice;
	private Integer totalValue;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Integer getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(Integer numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public Integer getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(Integer sharePrice) {
		this.sharePrice = sharePrice;
	}
	public Integer getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Integer totalValue) {
		this.totalValue = totalValue;
	}
}
