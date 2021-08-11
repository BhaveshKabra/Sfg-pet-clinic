package org.bhavesh.bootstrap;

import org.bhavesh.model.Owner;
import org.bhavesh.model.Vet;
import org.bhavesh.service.OwnerService;
import org.bhavesh.service.PetService;
import org.bhavesh.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootloader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final PetService petService;
	private final VetService vetService;
	
	public Bootloader(OwnerService ownerService, PetService petService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.petService = petService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1=new Owner();
		owner1.setId(1L);
		owner1.setFirstName("John");
		owner1.setLastName("Doe");
		ownerService.save(owner1);
		
		Owner owner2=new Owner();
		owner2.setId(1L);
		owner2.setFirstName("John");
		owner2.setLastName("Constatine");
		ownerService.save(owner2);
		
		Vet vet1=new Vet();
		vet1.setFirstName("Howdy");
		vet1.setLastName("Hoe");
		vet1.setId(1L);
		vetService.save(vet1);
		
		Vet vet2=new Vet();
		vet2.setFirstName("Rowan");
		vet2.setLastName("Bae");
		vet2.setId(2L);
		vetService.save(vet2);
	}

}
