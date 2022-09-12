/*Create aclass circle with following details:
Attributes:radius,area.
Method: calculateArea.
Create object of circle with given radius and calculate the area.
(Use the concept of parameterized constructor, code recommendation and 'this' keyword)*/


class Circle{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double calculateArea() {
		return 3.14*radius*radius;
	}
}

public class Question1 {
	public static void main(String args[]) {
		double area;
		double radius=10.5;
		Circle circle1=new Circle(radius);
		area=circle1.calculateArea();
		System.out.println("Area of circle with radius "+radius+" is " +area);
		radius=5.6; 
		Circle circle2=new Circle(radius);
		area=circle2.calculateArea();
		System.out.println("Area of circle with radius "+radius+" is " +area);
		radius=8.23;
		Circle circle3=new Circle(radius);
		area=circle3.calculateArea();
		System.out.println("Area of circle with radius "+radius+" is " +area);
	}
}
