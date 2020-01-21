package command;

import device.GarageDoor;

public class GarageUpCommand implements Command {
	GarageDoor garage;
	
	public GarageUpCommand(GarageDoor garage) {
		this.garage=garage;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garage.up();
	}

}
