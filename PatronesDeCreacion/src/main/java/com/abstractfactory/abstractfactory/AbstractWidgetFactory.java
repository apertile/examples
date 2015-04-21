package com.abstractfactory.abstractfactory;

import com.abstractfactory.abstractproduct.Window;

/*
 * Factories that create windows
 */
public interface AbstractWidgetFactory {
	public Window createWindow();
}
