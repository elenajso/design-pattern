package command;

import device.CeilingFan;

public class FanOnCommand implements Command {
	CeilingFan fan;
	
	public FanOnCommand(CeilingFan fan) {
		this.fan=fan;
	}
	
	@Override
	public void execute() {
		fan.medium();
		
	}

}
