package command;

import device.CeilingFan;

public class FanOffCommand implements Command{
	CeilingFan fan;
	
	public  FanOffCommand(CeilingFan fan) {
		this.fan=fan;
	}
	
	@Override
	public void execute() {
		fan.off();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
