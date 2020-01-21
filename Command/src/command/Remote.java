package command;

public class Remote {
	Command[] onBtns;
	Command[] offBtns;
	//Command[] upBtns;
	
	public static int ON=1;
	public static int OFF=2;
//	public static int Up=3;
	
	public Remote(){
		onBtns=new Command[5];
		offBtns = new Command[5];
		for(int i=0;i<5;i++){
			onBtns[i]=new NoCommand();
			offBtns[i]=new NoCommand();
			//NullPointException 피할수있다
		}
		//TODO : Null 해결합시다
	}
	
	public void setButton(int order, Command onCmd, Command offCmd){
		onBtns[order]=onCmd;
		offBtns[order]=offCmd;
		//upBtns[order]=upCmd;
		
	}
	
	public void push(int order, int onOff){
		//remote.push(0,Remote.ON) 이렇게 해놓으면 ON,OFF로 설정해놓은 매직넘버를 기억해놓을 필요가 없다
		if(onOff==ON){
			onBtns[order].execute();
			
		}
		else if(onOff==OFF){
			offBtns[order].execute();
		}
		
		//btn1.execute();
	}
	public void remove(int order, int onOff){
		if(onOff==Remote.ON){
			onBtns[order]=new NoCommand(); // Null포인터 피하기
		}
	}
	
	
}
