
public class Packed implements State
{

	Keychain keychain;
	
	public Packed(Keychain keychain) {
		this.keychain = keychain;
	}

	@Override
	public void start() {
		System.out.println("Your order is ready to pack");	

	}

	@Override
	public void stop() {
		System.out.println("Order has been Packed");	

	}

	
}
