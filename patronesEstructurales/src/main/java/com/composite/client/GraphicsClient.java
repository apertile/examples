package com.composite.client;

import com.composite.component.Graphic;

//Client.
public class GraphicsClient
{
	/**
	 * Given a graphics context, client can just call paint, without worrying if this is a composite or leaf 
	 **/
	public void paint(Graphic g)
	{
		g.paint();
	}
}
