package com.abstractfactory.concretefactory;

import com.abstractfactory.abstractfactory.AbstractWidgetFactory;
import com.abstractfactory.abstractproduct.Window;
import com.abstractfactory.concreteproduct.MSWindow;

public class MSWindowsWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		MSWindow window = new MSWindow();
		return window;
	}

}
