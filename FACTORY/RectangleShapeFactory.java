package FACTORY;

public class RectangleShapeFactory implements ShapeFactory{
    @Override
    public Rectangle createShape(){
        return new Rectangle();
    }
}
