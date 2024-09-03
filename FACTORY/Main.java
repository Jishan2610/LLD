package FACTORY;

public class Main {
    public static void main(String[] args){
        ShapeFactory circleObjFactory=new CircleShapeFactory();//Circle Shape Factory
        ShapeFactory rectangleObjFactory=new RectangleShapeFactory();//Rectangle Shape Factory
        Shape circleObj=circleObjFactory.createShape();
        Shape rectangleObj=rectangleObjFactory.createShape();
        circleObj.draw();
        rectangleObj.draw();
    }
}

