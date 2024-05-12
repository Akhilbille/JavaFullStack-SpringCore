package com.Practise.services;

public class BlueDart implements DeliverService {
	
	static {
		System.out.println("BlueDart Class Loaded.");
	}
	
	public BlueDart() {
		System.out.println("BlueDart Object created.");
	}
	
	@Override
	public Boolean deliverProduct(Double amount) {
		System.out.println("Delivering through Blue Dart : "+amount);
		return true;
	}

}
