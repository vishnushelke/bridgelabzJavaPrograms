package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class inventoryModel1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Grain> grain=null;

	public List<Grain> getGrain() {
		return grain;
	}

	public void setGrain(List<Grain> grain) {
		this.grain = grain;
	}

	@Override
	public String toString() {
		return "inventoryModel1 [grain=" + grain + "]";
	}
	
}
