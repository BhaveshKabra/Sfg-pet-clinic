package org.bhavesh.bootstrap;

import java.time.LocalDate;

import org.bhavesh.model.Owner;
import org.bhavesh.model.Pet;
import org.bhavesh.model.PetType;
import org.bhavesh.model.Speciality;
import org.bhavesh.model.Vet;
import org.bhavesh.service.OwnerService;
import org.bhavesh.service.PetService;
import org.bhavesh.service.PetTypeService;
import org.bhavesh.service.SpecialityService;
import org.bhavesh.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootloader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final PetService petService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	public Bootloader(OwnerService ownerService, PetService petService, VetService vetService,PetTypeService petTypeService,SpecialityService specialityService) {
		super();
		this.ownerService = ownerService;
		this.petService = petService;
		this.vetService = vetService;
		this.petTypeService=petTypeService;
		this.specialityService=specialityService;
	}

	@Override
	public void run(String... args) throws Exception {
		PetType dog=new PetType("Dog");
		petTypeService.save(dog);
		
		PetType cat=new PetType("Cat");
		petTypeService.save(cat);
		
		Owner owner1=new Owner();
		owner1.setId(1L);
		owner1.setFirstName("John");
		owner1.setLastName("Doe");
		owner1.setAddress("Some address 1");
		owner1.setCity("Owner1City");
		owner1.setTelephone("Some telephone no1");
		
		Pet pet1=new Pet();
		pet1.setPetType(dog);
		pet1.setOwner(owner1);
		pet1.setDob(LocalDate.now());
		pet1.setName("Dono");
		
		owner1.getPets().add(pet1);
		ownerService.save(owner1);
		
		

		
		
		Owner owner2=new Owner();
		owner2.setId(1L);
		owner2.setFirstName("John");
		owner2.setLastName("Constatine");
		owner2.setAddress("Some address 2");
		owner2.setCity("Owner2City");
		owner2.setTelephone("Some telephone no2");
		
		Pet pet2=new Pet();
		pet2.setPetType(cat);
		pet2.setOwner(owner2);
		pet2.setDob(LocalDate.now());
		pet2.setName("Woff");
		
		owner2.getPets().add(pet2);
		ownerService.save(owner2);
		
		Speciality radiology=new Speciality();
		radiology.setDescription("Radiology");
		
		specialityService.save(radiology); 
		
		Speciality dentist=new Speciality();
		dentist.setDescription("Dentist");
		
		specialityService.save(dentist);
		
		Speciality surgery=new Speciality();
		surgery.setDescription("Surgery");
		
		specialityService.save(surgery);
		
		Vet vet1=new Vet();
		vet1.setFirstName("Howdy");
		vet1.setLastName("Hoe");
		vet1.setId(1L);
		vet1.getSpecialities().add(surgery);
		vetService.save(vet1);
		
		Vet vet2=new Vet();
		vet2.setFirstName("Rowan");
		vet2.setLastName("Bae");
		vet2.setId(2L);
		vet2.getSpecialities().add(dentist);
		vetService.save(vet2);
		
	}

}
