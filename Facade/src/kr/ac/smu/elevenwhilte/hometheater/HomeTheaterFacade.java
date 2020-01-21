package kr.ac.smu.elevenwhilte.hometheater;

import lg.devices.Amp;
import samsung.devices.*;

public class HomeTheaterFacade {
	Amp amp;
	Projector pro;
	CDPlayer cdp;
	DVDPlayer dvdp;
	
	public HomeTheaterFacade(Amp amp, Projector pro, CDPlayer cdp, DVDPlayer dvdp) {
		this.amp=amp;
		this.pro=pro;
		this.cdp=cdp;
		this.dvdp=dvdp;
	
		
		//백도어가 싫다면
		
		this.amp=new Amp();
		
	}
	

	
	public void watchMovie() {
		amp.on();
		amp.setVolume(5);
		pro.on();
		dvdp.play();
		dvdp.setVolume(5);
		
	}
	
	public void stopMovie() {
		amp.off();
		pro.off();
		dvdp.stop();
		
	}
	
	public void listenMusic() {
		amp.on();
		amp.setVolume(7);
		cdp.play();
		cdp.setVolume(7);
	}
	
	public void stopMusic() {
		amp.off();
		cdp.stop();
	}
	
	
}
