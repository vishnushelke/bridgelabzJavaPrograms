package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class AdressbookModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<State> state = null;

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}
}
