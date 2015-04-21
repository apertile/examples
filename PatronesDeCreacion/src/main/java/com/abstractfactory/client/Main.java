package com.abstractfactory.client;

import com.abstractfactory.abstractfactory.AbstractWidgetFactory;
import com.abstractfactory.concretefactory.MSWindowsWidgetFactory;
import com.abstractfactory.concretefactory.MacOSXWidgetFactory;

public class Main {
	public static void main(String[] args){

		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory = null;

		// check what platform we're on
		if (System.getProperty("os.name") == "MACOSX"){
			widgetFactory = new MacOSXWidgetFactory();
		} else{
			widgetFactory = new MSWindowsWidgetFactory();
		}
		builder.buildWindow(widgetFactory);
	}
}
