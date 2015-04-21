package com.state.context;

import com.state.state.State;

public class TvContext implements State {
	 
    private State tvState;
 
    public void setState(State state) {
        this.tvState=state;
    }
 
    public State getState() {
        return this.tvState;
    }
 
    @Override
    public void doAction() {
        this.tvState.doAction();
    }
 
}