package shapes;

import java.lang.Comparable;

public abstract class Shape implements Comparable<Shape> {
	
	public double height;
	public String type;

	public double getHeight() 
	{	
		return this.height;
	}
	
	public String getType() 
	{
		return this.type;
	}
	
	public abstract double calcVolume();
	
	public abstract double calcBaseArea();
	
	public int compareTo(Shape s) 
	{
		if (this.getHeight() > s.getHeight()) return 1;
		else if (this.getHeight() < s.getHeight()) return -1;
		else return 0;
	} 
	

	

}
