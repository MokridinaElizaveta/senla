import java.util.ArrayList;

class Airline{
	String name;
	ArrayList<Airplane> airplanes = new ArrayList<>();
	ArrayList<Flight> flights = new ArrayList<>();
	
	Airline(){
		System.out.println("Airline");
	}	
	
	void addAirplane(Airplane airplane){
		airplanes.add(airplane);
	}
	
	void addFlight(Flight flight){
		flights.add(flight);
	}
}
	