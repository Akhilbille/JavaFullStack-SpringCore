package com.Practise.services;

public class FedEx implements DeliverService {
	
	static {
		System.out.println("FedEx Class Loaded.");
	}
	
	public FedEx() {
		System.out.println("FedEx Object created.");
	}
	
	@Override
	public Boolean deliverProduct(Double amount) {
		System.out.println("Delivering through Fedex : "+amount);
		return true;
	}

}
