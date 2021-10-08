import java.util.ArrayList;
import java.util.List;

public abstract class Winner {


	String name;
	List<String> item = new ArrayList<String>();
	
	public abstract Winner clean();
	public abstract Winner wash();
	public abstract Winner dry();
	
	public Keychain build() {
		Keychain keychain = new Keychain();
		keychain.setName(this.name);
		keychain.addItems(item);
		return keychain;
	}
	public String toString() {
		return "you won it";
	}
}
