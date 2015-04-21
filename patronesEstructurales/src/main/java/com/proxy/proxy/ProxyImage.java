package com.proxy.proxy;

import java.net.URL;

import com.proxy.realsubject.RealImage;
import com.proxy.subject.Image;

public class ProxyImage implements Image
{
    private URL url; 

    public ProxyImage(URL url)
    {
       this.url = url;
    }

    //this method delegates to the real image
    public void displayImage()
   {
        RealImage real = new RealImage(url);
        real.displayImage();
    }

}
