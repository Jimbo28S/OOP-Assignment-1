package shapes;

public class TriangularPrism extends Prism
{

	
	
	public double getHeight() 
	{
		return height;
	}
	
	public double getSide() 
	{
		return side;
	}
	
	public double calcVolume() 
	{
		return this.calcBaseArea() * height;
	}
	
	public double calcBaseArea() 
	{
		return ((side*side) * Math.sqrt(3)) / 4;
	}

	public TriangularPrism(String type, double height, double side) 
	{
		this.type = type;
		this.height = height;
		this.side = side;
	}
	
	public String toString() 
	{
		return "Shape: " + type + ", Height: " + height + ", Side Length: " + side + "\n";
	}
}
