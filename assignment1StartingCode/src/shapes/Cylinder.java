package shapes;

public class Cylinder extends Shape
{
	private double radius;
	
	public double getHeight() {
		return height;
	}

	public double getRaidus() {
		return radius;
	}

	
	public double calcVolume() 
	{	
		return Math.PI * (radius*radius) * height;
	}
	
	public double calcBaseArea() 
	{
		return Math.PI * (radius * radius);
	}
	
	public Cylinder(String type, double height, double radius) 
	{
		this.type = type;
		this.height = height;
		this.radius = radius;
	}
	
	public String toString() 
	{
		return "Shape: " + type + ", Height: " + height + ", Radius: " + radius + "\n";
	}

}
