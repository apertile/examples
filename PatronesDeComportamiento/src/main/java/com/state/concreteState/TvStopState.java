package com.state.concreteState;

import com.state.state.State;

public class TvStopState implements State {
	 
    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
 
}
