package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class inventoryModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Grains> grains = null;

	public List<Grains> getGrains() {
		return grains;
	}

	public void setGrains(List<Grains> grains) {
		this.grains = grains;
	}

	@Override
	public String toString() {
		return "inventoryModel [grains=" + grains + "]";
	}

	
}
