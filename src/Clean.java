public class Clean implements State
{

	Keychain keychain;
	
	public Clean(Keychain keychain) {
		this.keychain = keychain;
	}

	@Override
	public void start() {
		System.out.println("Your order is ready to clean");	

	}

	@Override
	public void stop() {
		System.out.println("Your order has been clean");	

	}

	
}
