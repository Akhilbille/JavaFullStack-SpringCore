package com.Practise.services;

public class BlueDart implements DeliverService {

	@Override
	public Boolean deliverProduct(Double amount) {
		System.out.println("Delivering through Blue Dart : "+amount);
		return true;
	}

}
