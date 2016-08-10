package com.objectdesignassignmentextended;

public class CommercialAirplane extends Airplane
{
	public int doors =0;
	public int windows = 0;
	public int seats = 0;
	public int wheels = 0;
	public int wings = 0;
	public int pilotsNeeded = 0;
	public int flightAttendants = 0;
	public float wingSpan = 0.0f;	
	public String snacksServed = null;
	public String whatDrink = null;
	public CommercialAirplane(int doors, int windows, int seats, int wheels, int wings, int pilotsNeeded,
			int flightAttendants, float wingSpan, String snacksServed, String whatDrink)
	{
		this.doors = doors;
		this.windows = windows;
		this.seats = seats;
		this.wheels = wheels;
		this.wings = wings;
		this.pilotsNeeded = pilotsNeeded;
		this.flightAttendants = flightAttendants;
		this.wingSpan = wingSpan;
		this.snacksServed = snacksServed;
		this.whatDrink = whatDrink;
	}
	public CommercialAirplane()
	{
		
	}
	
	
	
	
	public int getDoors()
	{
		return doors;
	}
	public void setDoors(int doors)
	{
		this.doors = doors;
	}
	public int getWindows()
	{
		return windows;
	}
	public void setWindows(int windows)
	{
		this.windows = windows;
	}
	public int getSeats()
	{
		return seats;
	}
	public void setSeats(int seats)
	{
		this.seats = seats;
	}
	public int getWheels()
	{
		return wheels;
	}
	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}
	public int getWings()
	{
		return wings;
	}
	public void setWings(int wings)
	{
		this.wings = wings;
	}
	public int getPilotsNeeded()
	{
		return pilotsNeeded;
	}
	public void setPilotsNeeded(int pilotsNeeded)
	{
		this.pilotsNeeded = pilotsNeeded;
	}
	public int getFlightAttendants()
	{
		return flightAttendants;
	}
	public void setFlightAttendants(int flightAttendants)
	{
		this.flightAttendants = flightAttendants;
	}
	public float getWingSpan()
	{
		return wingSpan;
	}
	public void setWingSpan(float wingSpan)
	{
		this.wingSpan = wingSpan;
	}
	public String getSnacksServed()
	{
		return snacksServed;
	}
	public void setSnacksServed(String snacksServed)
	{
		this.snacksServed = snacksServed;
	}
	public String whatDrink()
	{
		return whatDrink();
	}
	public void setWhatDrink(String whatDrink)
	{
		this.whatDrink = whatDrink;
	}
	@Override
	public void flys()
	{
		
	}
	@Override
	public void starts()
	{
		
	}
	@Override
	public void stops()
	{
		
	}
	@Override
	public String toString()
	{
		return "Welcome to your commercial airplane!  It features " + doors + " doors, " + windows + " windows, " + seats + " seats, " + wheels
				+ " wheels, " + wings + " wings, " + pilotsNeeded + " pilots, and " + flightAttendants
				+ " flight attendants. It has a wing span of " + wingSpan + " .  We will serve " + snacksServed + "  as well as " + whatDrink + ".";
	}
	
	
	
	
}
