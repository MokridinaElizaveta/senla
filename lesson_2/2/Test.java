class Test{
	public static void main(String[] s)
	{
		Airline airline = new Airline();
		Airplane airplane = new Airplane();
		Pilot pilot = new Pilot();
		Flight flight = new Flight();
		
		airline.addAirplane(airplane);
		airline.addFlight(flight);
		
		airplane.setAirline(airline);
		airplane.addPilot(pilot);
		
		flight.setAirplane(airplane);
		
		pilot.addAirplane(airplane);
	};
}