
public class NoSlip extends Tireoption {

	public NoSlip(Tire core) {
		super(core);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getTirename() {
		// TODO Auto-generated method stub
		return "No Slippery"+core.getTirename();
	}

}
