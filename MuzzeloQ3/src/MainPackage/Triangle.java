package MainPackage;
//Imports Math
import java.lang.Math;

public class Triangle extends GeometricObject {
	//Three double data fields for the sides of the triangle with default values of 1
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/** Constructs a default triangle */
	public Triangle(){	
	}
	
	/** Construct a triangle with three specified sides */
	public Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;	
	}
	
	/** Returns side1 */
	public double getside1() {
		return side1;
	}
	
	/** Returns side2 */
	public double getside2(){
		return side2;
	}
	
	/** Returns side3 */
	public double getside3(){
		return side3;
	}
	
	/** Calculates Area of a Triangle */
	public double getArea(){
		double p = (side1+side2+side3) / 2;
		double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}
	
	/** Calculates Perimeter of a Triangle */
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	/** Returns description of Triangle */
	@Override
	public String toString(){
		return "created on " + super.getDateCreated() + "\ncolor: " + super.getColor() +
			      "filled: " + super.isFilled() + "\narea" + getArea() + "\nperimeter" + getPerimeter();
	}
}
