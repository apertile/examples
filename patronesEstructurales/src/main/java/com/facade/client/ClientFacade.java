package com.facade.client;

import java.util.Date;

import com.facade.facade.TravelFacade;

public class ClientFacade {

	public static void main(String[] args) {
		Date today = new Date();
		Date tomorrow = null;
		TravelFacade facade = new TravelFacade();
		facade.getFlightsAndHotels(today, tomorrow);
	}
}
