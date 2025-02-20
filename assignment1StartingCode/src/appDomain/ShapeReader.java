package appDomain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;
import shapes.TriangularPrism;

public class ShapeReader {

	public static Shape[] createList() 
	{
		final String shapesFile = "./res/shapes1.txt";
		
		Shape[] shapes = null;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(shapesFile));
			
			// Reads the first line of text to determine array size
			String line = reader.readLine();
			
			int arraySize = Integer.parseInt(line);
			
			shapes = new Shape[arraySize];
			
			for (int i = 0; i < arraySize; i++) 
			{
				// Determine the shape type and create that shape
				line = reader.readLine();
				String[] parts = line.split(" ");
				String targetShape = parts[0];
					
				
				switch (targetShape) 
				{
				
				// If Cone
				case "Cone":
					// Create Cone
					Cone cone = new Cone(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
						
					// Add it to the array
					shapes[i] = cone;
					continue;
				
				// If Pyramid
				case "Pyramid":
					// Create Pyramid
					Pyramid pyramid = new Pyramid(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
						
					// Add it to the array
					shapes[i] = pyramid;
					continue;
				
				// If Cylinder
				case "Cylinder":
					// Create Cylinder
					Cylinder cylinder = new Cylinder(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
						
					// Add it to the array
					shapes[i] = cylinder;
					continue;
				
				// If Octagonal Prism
				case "OctagonalPrism":
					// Create Octagonal Prism
					OctagonalPrism octagonalPrism = new OctagonalPrism(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
					
					// Add it to the array
					shapes[i] = octagonalPrism;
					System.out.println("octagonalprism created");
					continue;
					
				// If Square Prism
				case "SquarePrism":
					// Create Square Prism
					SquarePrism squarePrism = new SquarePrism(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
					
					// Add it to the array
					shapes[i] = squarePrism;
					continue;
					
				// If Pentagonal Prism
				case "PentagonalPrism":
					// Create Pentagonal Prism
					PentagonalPrism pentagonalPrism = new PentagonalPrism(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
					
					// Add it to the array
					shapes[i] = pentagonalPrism;
					continue;
					
				// If Triangular Prism
				case "TriangularPrism":
					// Create a Triangular Prism
					TriangularPrism triangularPrism = new TriangularPrism(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
					
					// Add it to the Array
					shapes[i] = triangularPrism;
					continue;
				}
			}
					
			reader.close();
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return shapes;
	}

}
