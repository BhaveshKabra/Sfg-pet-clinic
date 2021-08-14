package org.bhavesh.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1684730891975785655L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
}