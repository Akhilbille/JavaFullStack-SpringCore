package com.Practise1;
import Services.DHL;
import Services.FedEx;

public class LaunchApp1 {

	public static void main(String[] args) {
		
		System.out.println("Hello Welcome to the First Application... ");
		
		//Target Class
		//Constructor Injection
		Amazon amz = new Amazon(new DHL());
		
		//Here FedEx is the dependent object.
		//Injecting dependent object  through the setter to a target class is called as Setter Injection.
		amz.setService(new FedEx());		
		
		Boolean status = amz.deliverTheProduct(100.00);
		
		if(status)
			System.out.println("Product delivered successfully.");
		else
			System.out.println("Delivery Failed... Please contact customer support team.");

	};

}
