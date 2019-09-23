//package asd;
//
//interface Shape {
//    void sayHello();
//}
//class Circle implements Shape {
//
//    @Override
//    public void sayHello() {
//        System.out.println("I am circle");
//    }
//
//}
//class Triangle implements Shape {
//
//    @Override
//    public void sayHello() {
//        System.out.println("I am triangle");
//    }
//
//}
//class Rectangle implements Shape {
//
//    @Override
//    public void sayHello() {
//        System.out.println("I am rectangle");
//    }
//
//}
//public class ShapeFactory {
//    
//    public static final String CIRCLE = "circle";
//    public static final String RECTANGLE = "rectangle";
//    public static final String TRIANGLE = "triangle";
//
//    public static Shape create(String name) {
//        Shape shape = null;
//        if (name == null)
//            throw new NullPointerException();
//
//        if (name.equals("circle")) {
//            shape = new Circle();
//        } else if (name.equals("rectangle")) {
//            shape = new Rectangle();
//        } else if (name.equals("triangle")) {
//            shape = new Triangle();
//        } 
//        return shape;
//    }
//    public static void main(String[] args) {
//      	 ShapeFactory shape = ShapeFactory.create(ShapeFactory.CIRCLE);
//      	 shape.sayHello();
//       }
//}
