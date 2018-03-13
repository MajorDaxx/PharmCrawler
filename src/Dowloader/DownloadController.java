package Dowloader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DownloadController {

	private static DownloadController downloadControler = new DownloadController();
	
	private DownloadController() {
		
		l = new HashMap<>();
	}
	
//	ClassFinder f;
	Map<String,Downloader> l;
	
	
	
	public static DownloadController getController() {
		return downloadControler;
	}
	
	public void addHost(String Host) {
		
	}
	
	
	
	
	
}
