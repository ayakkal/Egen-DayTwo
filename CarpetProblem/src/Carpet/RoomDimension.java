package Carpet;

public class RoomDimension extends Country{

	private int length;
	private int width;
	
	public RoomDimension(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	
	
	public int area() {
		
		return this.length * this.width;
		
	}

	
	
	
}
