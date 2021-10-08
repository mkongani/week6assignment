

public class KeychainCleanClass extends Winner{

	public KeychainCleanClass() {
		this.name = "Clean Keychain pocess";
	}
	@Override
	public Winner clean() {
		return this;
	}

	@Override
	public Winner wash() {
		this.item.add("wash");
		return this;	
		}

	@Override
	public Winner dry() {
		this.item.add("dry");
		return this;
	}
}
