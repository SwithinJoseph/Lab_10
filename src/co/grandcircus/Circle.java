package co.grandcircus;

public class Circle {

	private double radius;
	private double circumference;
	private double area;

	public Circle() {
		radius = 0.0;
		circumference = 0.0;
		area = 0.0;
	}

	public Circle(double rad) {
		radius = rad;
	}

	public double getCircumference() {
		return circumference = Math.PI * (2 * radius);
	}

	public double getArea() {
		return area = Math.PI * Math.pow(radius, 2);
	}

	private static String formatNumber(double x) { //formats to 2 decimal places
		return String.format("%.2f", x);		   //used for all measurements
	}

	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}

	public String getFormattedArea() {
		return formatNumber(getArea());
	}

	@Override
	public String toString() {
		return String.format("\nRadius: " + formatNumber(radius) + "\nCircumference: " + getFormattedCircumference()
				+ "\nArea: " + getFormattedArea());

	}

}
