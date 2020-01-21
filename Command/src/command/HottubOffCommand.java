package command;

import device.Hottub;

public class HottubOffCommand implements Command {
Hottub tub;
public HottubOffCommand(Hottub tub) {
	this.tub=tub;
}
	@Override
	public void execute() {
		tub.setTemperature(40);

	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
