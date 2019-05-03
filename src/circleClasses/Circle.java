package circleClasses;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {

	private double Radius;
	private double Diameter;

	public Circle(double radius) {
		this.Radius = radius;
	}

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}

	public double getCircumference(double circumference) {
		double cc;
		try {
			cc = Radius * 2 * Math.PI;
		} catch (ArithmeticException e) {
			return 0;
		}
		return cc;
	}

	public double getArea(double findArea) {
		double area;
		try {
			area = ((findArea * findArea) * Math.PI);
		} catch (ArithmeticException e) {
			return 0;
		}

		return area;
	}

	private static String formatNumber(double x) {
		DecimalFormat twoD = new DecimalFormat("#.##");
		double newNum = Double.valueOf(twoD.format(x));
		String stringNum = Double.toString(newNum);
		return stringNum;
	}

	public String getFormattedCircumference() {
		String formattedCirc = formatNumber(getCircumference(Radius));
		return formattedCirc;
	}

	public String getFormattedArea() {
		String formattedArea = formatNumber(getCircumference(Radius));
		return formattedArea;
	}

}
