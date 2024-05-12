package Services;

public class FedEx implements DeliverService {

	@Override
	public Boolean deliverProduct(Double amount) {
		System.out.println("Delivering through Fedex : "+amount);
		return true;
	}

}
