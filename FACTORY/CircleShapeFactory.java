package FACTORY;

public class CircleShapeFactory implements ShapeFactory{
     @Override
     public Circle createShape(){
        return new Circle();
     }
}
