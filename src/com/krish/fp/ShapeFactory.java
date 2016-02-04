package com.krish.fp;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        
        if (shapeType == null)
            return null;
        else if (shapeType.equals("CIRCLE"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Ractangle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();

        return null;
    }
}
