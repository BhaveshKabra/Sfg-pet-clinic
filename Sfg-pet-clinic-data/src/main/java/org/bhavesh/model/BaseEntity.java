package org.bhavesh.model;

import java.io.Serializable;

public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1684730891975785655L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
