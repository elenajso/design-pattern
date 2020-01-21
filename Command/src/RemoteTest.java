import command.Command;
import command.FanOffCommand;
import command.FanOnCommand;
import command.GarageOffCommand;
import command.GarageUpCommand;
import command.HottubOffCommand;
import command.Remote;
import command.TubBubbleOn;
import device.CeilingFan;
import device.GarageDoor;
import device.Hottub;

public class RemoteTest {

	public static void main(String[] args) {
		Remote remote = new Remote();
		
		CeilingFan fan=new CeilingFan("거실");
		GarageDoor garage=new GarageDoor("차고");
		Hottub tub=new Hottub();
		
	//	Command cmd1=new FanOnCommand(fan);
	//	Command cmd2=new FanOffCommand(fan);
	//	Command cmd3=new GarageUpCommand(garage);
	//	Command cmd4=new GarageOffCommand(garage);
	//	Command cmd5=new TubBubbleOn();
		

		remote.setButton(0,new FanOnCommand(fan), new FanOffCommand(fan));
		remote.setButton(1,new GarageUpCommand(garage), new GarageOffCommand(garage));
		remote.setButton(2, new TubBubbleOn(tub), new HottubOffCommand(tub));
		remote.push(0,Remote.ON);
		remote.push(0, Remote.OFF);
		remote.push(1,Remote.ON);
		remote.push(1,Remote.OFF);
		remote.push(2, Remote.ON);
		remote.push(2,Remote.OFF);
		//remote.push(0, 0, Remote.Up);
		
		//remote.setButton1(0,new GarageUpCommand(garage));
	}
		
		
}
