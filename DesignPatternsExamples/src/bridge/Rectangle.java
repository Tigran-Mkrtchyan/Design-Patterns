package bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	
	void descriptionShape() {
		System.out.print("This is rectangle ");
		color.descriptionCollor();
	}

}
