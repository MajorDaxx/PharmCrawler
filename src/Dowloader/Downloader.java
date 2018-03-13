package Dowloader;

import java.net.URL;

public abstract class Downloader  extends Thread{

	URL host;
	
	public Downloader(URL host) {
		this.host = host;
	}
	
	
}
