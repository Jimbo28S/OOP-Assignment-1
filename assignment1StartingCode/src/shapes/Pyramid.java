package shapes;

public class Pyramid extends Shape
{
	
	private double side;
	
	public double getHeight() {
		return height;
	}

	public double getSide() {
		return side;
	}

	
	public double calcVolume() 
	{	
		return (1/3) * this.calcBaseArea() * height;
	}
	
	public double calcBaseArea() 
	{
		return side * side;
	}

	public Pyramid(String type, double Height, double Side) 
	{
		this.type = type;
		height = Height;
		side = Side;
	}
	
	public String toString() 
	{
		return "Shape: " + type + ", Height: " + height + ", Side Length: " + side + "\n";
	}
}
