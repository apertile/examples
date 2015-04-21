package com.abstractfactory.concretefactory;

import com.abstractfactory.abstractfactory.AbstractWidgetFactory;
import com.abstractfactory.abstractproduct.Window;
import com.abstractfactory.concreteproduct.MacOSXWindow;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		MacOSXWindow window = new MacOSXWindow();  
		return window;
	}

}
