package kr.ac.smu.elevenwhilte.hometheater;

import lg.devices.Amp;
import samsung.devices.*;

public class HomeThearterMain {
	public static void main(String[] args) {
		Amp amp=new Amp();
		Projector pro=new Projector();
		CDPlayer cdp=new CDPlayer();
		DVDPlayer dvdp=new DVDPlayer();
		
		//Connector c = new Connector();
		
		//facade ¸¸µé±â
		
		HomeTheaterFacade facade=new HomeTheaterFacade(amp, pro, cdp, dvdp);
		//facade.setVolume(dvdp);
		
		facade.watchMovie();
		dvdp.setVolume(10);
		System.out.println("---²ô±â");
		facade.stopMovie();
	}
	
	
}
