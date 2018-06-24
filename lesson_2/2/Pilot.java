import java.util.ArrayList;

class Pilot{
	String name;
	String surname;
	ArrayList<Airplane> airplanes = new ArrayList<>();
	
	Pilot(){
		System.out.println("Pilot");
	}	
	
	void addAirplane(Airplane airplane){
		airplanes.add(airplane);
	}
}
	