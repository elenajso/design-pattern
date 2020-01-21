
public class Chained extends Tireoption {

	public Chained(Tire core) {
		super(core);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getTirename() {
		// TODO Auto-generated method stub
		return "Chained"+core.getTirename();
	}

}
