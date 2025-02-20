package shapes;

public class OctagonalPrism extends Prism
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
		return 2 * (1 + Math.sqrt(2)) * (side*side);
	}
	
	public OctagonalPrism(String type, double height, double side) 
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
