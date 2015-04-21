package com.state.client;

import com.state.concreteState.TvStartState;
import com.state.concreteState.TvStopState;
import com.state.context.TvContext;
import com.state.state.State;

public class TvRemote {
	 
    public static void main(String[] args) {
        TvContext context = new TvContext();
        State tvStartState = new TvStartState();
        State tvStopState = new TvStopState();
         
        context.setState(tvStartState);
        context.doAction();
         
         
        context.setState(tvStopState);
        context.doAction();
         
    }
 
}
