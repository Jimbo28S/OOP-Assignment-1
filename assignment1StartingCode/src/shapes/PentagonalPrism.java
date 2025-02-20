package shapes;

public class PentagonalPrism extends Prism
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
		return (5 * (side*side) * Math.tan(54)) / 4;
	}
	
	public PentagonalPrism(String type, double height, double side) 
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
