
public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		System.out.println("Area : " + ((Math.PI)* radius * radius));
	}
}
