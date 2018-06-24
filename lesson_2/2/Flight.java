class Flight{
	String from;
	String to;
	Airplane airplane;
	
	Flight(){
		System.out.println("Flight");
	}

	void setAirplane(Airplane airplane){
		this.airplane =  airplane;
	}
}