package com.state.concreteState;

import com.state.state.State;

public class TvStartState implements State {
	 
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
 
}
