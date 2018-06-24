import java.util.ArrayList;

class Airplane{
	String model;
	Airline airline;
	ArrayList<Pilot> pilots = new ArrayList<>();
	
	Airplane(){
		System.out.println("Airplane");
	}	
	
	void setAirline(Airline airline){
		this.airline =  airline;
	}
	
	void addPilot(Pilot pilot){
		pilots.add(pilot);
	}
	
}