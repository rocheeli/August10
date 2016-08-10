package com.objectdesignassignmentextended;

public class AirBus extends CommercialAirplane
{
	private boolean checkBags = false;

	public AirBus(int doors, int windows, int seats, int wheels, int wings, int pilotsNeeded, int flightAttendants,
			float wingSpan, String snacksServed, String whatDrink, boolean checkBags)
	{
		super(doors, windows, seats, wheels, wings, pilotsNeeded, flightAttendants, wingSpan, snacksServed, whatDrink);
		this.checkBags = checkBags;
	}

	public boolean isCheckBags()
	{
		return checkBags;
	}

	public void setCheckBags(boolean checkBags)
	{
		this.checkBags = checkBags;
	}
	
	
}
