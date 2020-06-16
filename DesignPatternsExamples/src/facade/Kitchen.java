package facade;

public class Kitchen {
	private boolean readyFood;
	
	
	public boolean isReadyFood() {
		return readyFood;
	}
	public void setIsReadyFood(boolean readyFood) {
		this.readyFood = readyFood;
	}
	public void finishCooking() {
		System.out.println("chef finish cooking");
		readyFood = true;
	}
	
}
