
public class Square extends Shape {

	private int sideLength;

	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}
	
	public void calculateArea() {
		System.out.println("Area : " + (sideLength)*(sideLength));
	}

}
