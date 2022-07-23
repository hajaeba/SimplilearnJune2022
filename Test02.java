package mypackage;
 
abstract class Shape
{
	String color;
	abstract double area();//abs method
	//every abstrct method is public by default
	public abstract String toString();//abs method
	public Shape(String color) { //para constructor
		this.color = color;  
	}
	public String getColor() {
		return color;
	}
	}
class Circle extends Shape
{
	double radius;

	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle class constructor called");
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is "+super.color 
				+ " and area is:"+area();
	}
	}
class Rectangle extends Shape //Rectangle and circle are concert class
// which is implementing shape class
{
	double length;
	double width;
	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor class called");
		this.length = length;
		this.width = width;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return"Rectangle color is " +super.color //invoke parent class variable
				+" and  area is: "+ area();
	}
	
	}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape s1 =new Circle ("Red",2.2);
     Shape s2 = new Rectangle("Yellow",2,4);
     System.out.println(s1.toString());
     System.out.println(s2.toString());
	}

}
