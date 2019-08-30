package nadiatests;

public class DPFactory {
    public interface Shape {
       void draw();
    }
    public class Rectangle implements Shape {
       @Override
       public void draw() {
          System.out.println("Inside Rectangle::draw() method.");
       }
    }
    public class Square implements Shape {
       @Override
       public void draw() {
          System.out.println("Inside Square::draw() method.");
       }
    }
    public class Circle implements Shape {
       @Override
       public void draw() {
          System.out.println("Inside Circle::draw() method.");
       }
    }
    public class ShapeFactory {
       //use getShape method to get object of type shape
       public Shape getShape(String shapeType){
          if(shapeType == null){
             return null;
          }
          if(shapeType.equalsIgnoreCase("CIRCLE")){
             return new Circle();
          } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
             return new Rectangle();
          } else if(shapeType.equalsIgnoreCase("SQUARE")){
             return new Square();
          }
          return null;
       }
    }
    public class FactoryPatternDemo {
       public  void main(String[] args) {
          ShapeFactory shapeFactory = new ShapeFactory();
          //get an object of Circle and call its draw method.
          Shape shape1 = shapeFactory.getShape("CIRCLE");
          shape1.draw();
          Shape shape2 = shapeFactory.getShape("RECTANGLE");
          shape2.draw();
          Shape shape3 = shapeFactory.getShape("SQUARE");
          shape3.draw();
       }
    }
}
