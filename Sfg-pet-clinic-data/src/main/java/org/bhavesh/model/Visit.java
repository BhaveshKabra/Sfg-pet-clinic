package org.bhavesh.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Visit extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4850118280039330456L;
	private LocalDate date;
    private String description;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="pet_id")
    private Pet pet;
}