package com.composite.component;

//Component interface 
public interface Graphic {
	public void add(Graphic g);

	public void remove(Graphic g);

	public Graphic get(int index);

	public void paint();
}
