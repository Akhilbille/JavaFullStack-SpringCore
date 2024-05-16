package com.Practise.main;
import com.Practise.services.DeliverService;

//Target class
public class Amazon {
	
	private DeliverService service;
	
	public Amazon() {
		System.out.println("Creating an Amazon bean through the Constructor. ");
	}
	
	
	public Amazon(DeliverService service) {
		System.out.println("Injecting through Constructor");
		this.service = service;
	}

	public void setService(DeliverService service) {
		System.out.println("Injecting through Setter");
		this.service = service;
	}

	public Boolean deliverTheProduct(Double amount) {
		return service.deliverProduct(amount);
	}
	
	

}
