package Dowloader;

import java.net.MalformedURLException;
import java.net.URL;

public class DownloaderShopApotheke extends Downloader{

	public DownloaderShopApotheke() throws MalformedURLException {
		super(new URL("www.docmorris.de"));
	}
	
	
}
