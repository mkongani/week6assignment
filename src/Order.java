
public class Order implements State
{

	Keychain keychain;
	
	public Order(Keychain keychain) {
		this.keychain = keychain;
	}

	@Override
	public void start() {
		System.out.println("Your order is start now");	

	}

	@Override
	public void stop() {
		System.out.println("Your order is ended!!!");	

	}

	
}
