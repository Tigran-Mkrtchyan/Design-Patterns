package bridge;

public class Circle extends Shape {
	public Circle (Color color) {
		super(color);
	}

	@Override
	void descriptionShape() {
		System.out.print("This is a circle");
		color.descriptionCollor();
	}

}
