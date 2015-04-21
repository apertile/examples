package com.facade.facade;

import java.util.ArrayList;
import java.util.Date;

import com.facade.subsystems.FlightBooker;
import com.facade.subsystems.HotelBooker;

public class TravelFacade
{

   private HotelBooker hotelBooker;
   private FlightBooker flightBooker; 

  public void getFlightsAndHotels(Date from, Date to)
  {
         ArrayList<String> flights = flightBooker.getFlightsFor(from, to);
         ArrayList<String> hotels = hotelBooker.getHotelNamesFor(from, to);

         System.out.println("Flights for range: " + from + "to " + to + "are " + flights);
         System.out.println("Hotels for range: " + from + "to " + to + "are " + hotels);

   }

}