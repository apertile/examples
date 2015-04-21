package com.proxy.client;

import java.net.MalformedURLException;
import java.net.URL;

import com.proxy.proxy.ProxyImage;
import com.proxy.subject.Image;

public class ProxyClient {
	
	public void main(String[] args) throws MalformedURLException{
			Image image = new ProxyImage(new URL("myImage"));
			image.displayImage();
		
	}

}
