
public class Driver {

	public static void main(String[] args) {

//		Shape shape = new Shape();

		Square square = new Square();
		square.setPosX(10);
		square.setPosY(25);
		square.setColor("Kırmızı");
		square.setSideLength(10);
		square.calculateArea();
		
		//System.out.println(square.getSideLength());

		Rectangle rectangle = new Rectangle();
		rectangle.setPosX(20);
		rectangle.setPosY(30);
		rectangle.setColor("Sarı");
		rectangle.setHeight(10);
		rectangle.setLength(20);
		rectangle.calculateArea();
		
		Circle circle = new Circle();
		circle.setPosX(20);
		circle.setPosY(25);
		circle.setColor("Black");
		circle.setRadius(15);
		circle.calculateArea();
	}

}
