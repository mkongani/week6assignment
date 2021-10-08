public class Shipped implements State
{

	Keychain keychain;
	
	public Shipped(Keychain keychain) {
		this.keychain = keychain;
	}

	@Override
	public void start() {
		System.out.println("Your order is ready to shipped");	

	}

	@Override
	public void stop() {
		System.out.println("Order has been shipped");	

	}

	
}
