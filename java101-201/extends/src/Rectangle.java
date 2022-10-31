
public class Rectangle extends Shape {

	private int length;
	private int height;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void calculateArea() {
		System.out.println("Area : " + (length)*(height));
	}
}
