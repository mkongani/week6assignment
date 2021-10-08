import java.util.List;

public class Keychain {
	State order;
	State clean;
	State pack;
	State ship;
	State deliver;
	
	State s;
	String name;
	List<String> phases;
	public Keychain()
	    {
	    	order = new Order(this);
	    	clean = new Clean(this);
	    	pack = new Packed(this);
			ship = new Shipped(this);
	    	deliver = new Delivered(this);    
	    }
	void addItems(List<String> phases) {
		this.phases = phases;
	}
 
	void process() {
		System.out.println("process " + name + " and :");
		for (String phase : phases) {
			System.out.println("   " + phase);
		}
	}
	public void start() {

		s.start();
	}

	public void stop() {

		s.stop();
	}
 
	public void setName(String name) {
		this.name = name;
	}

	
	public State getS() {
		return s;
	}
	public void setS(State s) {
		this.s = s;
	}
	public State getOrder() {
		return order;
	}
	public State getClean() {
		return clean;
	}
	public State getPack() {
		return pack;
	}
	public State getShipped() {
		return ship;
	}
	public State getDeliver() {
		return deliver;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append(this.name + "\n");
		for (String phase : phases) {
			display.append(phase + "\n");
		}
		return display.toString();
	}
}


