package com.objectdesignassignmentextended;

import java.util.Scanner;

import javax.script.ScriptException;

public class Airport 
{

	public static void main(String[] args)
	{
		Scanner crashAndBurn = new Scanner(System.in);
		String userAirplaneInput = null;
		boolean userMistake = false;
		int airplaneTrait = 0;
		float airplaneTraitFloat = 0.0f;
		String airplaneTraitString = null;
		boolean airplaneTraitBoolean = false;
		CommercialAirplane ourNewPlane = new CommercialAirplane();
		
		System.out.println("Welcome to th Airport!");
		System.out.println("Tell us about your flight needs today.");
		System.out.println("Where would like travel today?");
		String userDestination = crashAndBurn.nextLine();
		
		do
		{
			System.out.println("How many doors would you like the plane to have?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		}
		while(userMistake);
		
			airplaneTrait = Integer.parseInt(userAirplaneInput);
			ourNewPlane.setDoors(airplaneTrait);
		
		do
		{
			userMistake = false;
			System.out.println("How many windows would you like?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
			
		}
		while(userMistake);
		
			airplaneTrait= Integer.parseInt(userAirplaneInput);
		
			ourNewPlane.setWindows(airplaneTrait);
		
		do
		{
			userMistake = false;
			System.out.println("How many seats would you like?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
			
		}
		while(userMistake);
		
			airplaneTrait= Integer.parseInt(userAirplaneInput);
		
			ourNewPlane.setSeats(airplaneTrait);
	
	
	do
	{
		 userMistake = false;
		 System.out.println("How many wheels would you like?");
		 userAirplaneInput = crashAndBurn.nextLine();
		
		 userMistake = numberEnteredIsValid(userAirplaneInput);
		
	}
	while(userMistake);
	
		airplaneTrait= Integer.parseInt(userAirplaneInput);
	
		ourNewPlane.setWheels(airplaneTrait);
	
	do
	{
		userMistake = false;
		System.out.println("How many wings would you like?");
		userAirplaneInput = crashAndBurn.nextLine();
		
		userMistake = numberEnteredIsValid(userAirplaneInput);
		
	}
	while(userMistake);
	
		airplaneTrait= Integer.parseInt(userAirplaneInput);
	
		ourNewPlane.setWings(airplaneTrait);
	
	do
	{
		userMistake = false;
		System.out.println("How many pilots would you like?");
		userAirplaneInput = crashAndBurn.nextLine();
		
		userMistake = numberEnteredIsValid(userAirplaneInput);
		
	}
	while(userMistake);
	
		airplaneTrait= Integer.parseInt(userAirplaneInput);
	
		ourNewPlane.setPilotsNeeded(airplaneTrait);
	
	do
	{
		userMistake = false;
		System.out.println("How many flight attendants would you like?");
		userAirplaneInput = crashAndBurn.nextLine();
		
		userMistake = numberEnteredIsValid(userAirplaneInput);
		
	}
	while(userMistake);
	
		airplaneTrait= Integer.parseInt(userAirplaneInput);
	
		ourNewPlane.setFlightAttendants(airplaneTrait);
	
	do
	{
		userMistake = false;
		System.out.println("What wing span would you like?");
		userAirplaneInput = crashAndBurn.nextLine();
		
		userMistake = floatEnteredIsValid(userAirplaneInput);
		
	}
	while(userMistake);
	
		airplaneTraitFloat= Float.parseFloat(userAirplaneInput);
	
		ourNewPlane.setWingSpan(airplaneTraitFloat);
	
	do
	{
		userMistake = false;
		System.out.println("What snack would you like served?");
		userAirplaneInput = crashAndBurn.nextLine();
		
		userMistake = stringEnteredIsValid(userAirplaneInput);
		
	}
	while(userMistake);
		airplaneTraitString= userAirplaneInput;
		ourNewPlane.setSnacksServed(airplaneTraitString);
	
	do
	{
		userMistake = false;
		System.out.println("What drink would you like?");
		userAirplaneInput = crashAndBurn.nextLine();
		
		userMistake = stringEnteredIsValid(userAirplaneInput);
		
	}
	while(userMistake);
		airplaneTraitString= userAirplaneInput;
		ourNewPlane.setWhatDrink(airplaneTraitString);
	
	
	System.out.println(ourNewPlane.toString());
	
}//main
	public static boolean numberEnteredIsValid(String someStringToCreateNumber)
	{
		try
		{
			int aNumber = Integer.parseInt(someStringToCreateNumber);
			return false;
			
		}
		catch (NumberFormatException e)
		{
			return true;
		}
	}
	public static boolean floatEnteredIsValid(String someStringToCreateFloat)
	{
		try
		{
			float aFloat = Float.parseFloat(someStringToCreateFloat);
			return false;
		}
		catch (NumberFormatException e)
		{
			return true;
		}
	}
		public static boolean stringEnteredIsValid(String someStringToCreateString)
		{
			try
			{
				float aFloat = Float.parseFloat(someStringToCreateString);
				return true;
			}
			catch (NumberFormatException e)
			{
				return false;
			}
		}
	
	}
	


