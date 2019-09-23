package com.bridgelabz.model;

public class Transaction {
	private int paidmoney;
	private int stocksold;
	private String paidto;
	private String paidby;
	private String date;
	public int getPaidmoney() {
		return paidmoney;
	}
	public void setPaidmoney(int paidmoney) {
		this.paidmoney = paidmoney;
	}
	public int getStocksold() {
		return stocksold;
	}
	public void setStocksold(int stocksold) {
		this.stocksold = stocksold;
	}
	public String getPaidto() {
		return paidto;
	}
	public void setPaidto(String paidto) {
		this.paidto = paidto;
	}
	public String getPaidby() {
		return paidby;
	}
	public void setPaidby(String paidby) {
		this.paidby = paidby;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
