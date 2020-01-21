package command;

import device.GarageDoor;

public class GarageOffCommand implements Command {
GarageDoor garage;
public GarageOffCommand(GarageDoor garage) {
	this.garage=garage;
}
	@Override
	public void execute() {
		garage.stop();

	}

}
