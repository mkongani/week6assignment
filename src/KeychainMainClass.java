public class KeychainMainClass {

	public static void main(String[] args) {

		Winner cleanBuilder = new KeychainCleanClass();
		Keychain cleaning = cleanBuilder.clean().wash().dry().build();
		
		cleaning.setS(new Order(cleaning));
		cleaning.start();
		cleaning.process();

		cleaning.setS(new Clean(cleaning));
		cleaning.start();
		cleaning.stop();

		cleaning.setS(new Packed(cleaning));	
		cleaning.start();
		cleaning.stop();

		cleaning.setS(new Shipped(cleaning));	
		cleaning.start();
		cleaning.stop();
		
		cleaning.setS(new Delivered(cleaning));	
		cleaning.start();
		cleaning.stop();
	}
}
