package com.abstractfactory.concreteproduct;

import com.abstractfactory.abstractproduct.Window;

public class MacOSXWindow implements Window{
	
	public void setTitle(String text) {
		// Mac OSX specific behavior
	}

	public void repaint() {
		// Mac OSX specific behavior
	}

}
