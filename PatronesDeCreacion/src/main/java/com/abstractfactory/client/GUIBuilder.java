package com.abstractfactory.client;

import com.abstractfactory.abstractfactory.AbstractWidgetFactory;
import com.abstractfactory.abstractproduct.Window;

public class GUIBuilder {

	public void buildWindow(AbstractWidgetFactory widgetFactory)

	{
		Window window = widgetFactory.createWindow();
		window.setTitle("New Window");
	}
}