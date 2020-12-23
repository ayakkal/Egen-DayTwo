package Carpet;

public class RoomCarpet extends RoomDimension {
	
	
	private String country;
	
	
	public RoomCarpet(int length, int width, String country) {
		super(length, width);
		this.country = country;
	}


	public int totalCost() {
		return this.area() * this.getCost(country);	
	}

}
