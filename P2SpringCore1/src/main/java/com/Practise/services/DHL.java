package com.Practise.services;

public class DHL implements DeliverService {
	
	static {
		System.out.println("DHL Class Loaded.");
	}
	
	public DHL() {
		System.out.println("DHL Object created.");
	}

	@Override
	public Boolean deliverProduct(Double amount) {
		System.out.println("Delivering through DHL : "+amount);
		return true;
	}

}
