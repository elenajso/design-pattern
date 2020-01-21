package command;

import device.Hottub;

public class TubBubbleOn implements Command {
	Hottub tub;
	
	public TubBubbleOn(Hottub tub) {
		this.tub=tub;
	}
	
	@Override
	public void execute() {
		tub.bubblesOn();

	}

}
