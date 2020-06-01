package abstract_factory;

/* Create RoundedShapeFactory class extending AbstractFactory to generate 
 * object of concrete class based on given information. 
 */

public class RoundedShapeFactory extends AbstractFactory {
	// TO-DO: Implement the getShape() method
	@Override
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RoundedRectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new RoundedSquare();
	      }	 
		/*
		 * check for the shape type is equal to 'Rectangle' or 'Square' (ignore case)
		 * then return the corresponding type
		 */
		return null;
	}
}