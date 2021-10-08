
public class Delivered implements State
{

	Keychain keychain;
	
	public Delivered(Keychain keychain) {
		this.keychain = keychain;
	}

	@Override
	public void start() {
		System.out.println("Your order will deliver soon");	

	}

	@Override
	public void stop() {
		System.out.println("Your order has deliverd!!!");	

	}

	
}