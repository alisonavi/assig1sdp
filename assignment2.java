public interface Shape {
    void draw();
}
// getting the shape interface

// inplementing the circle
public class Circle implements Shape {
    private int radius;
// getting the private
    public Circle(int radius) {
        this.radius = radius;
    }

  // overriding the function
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
// square class implementing for this
public class Square implements Shape {
    private int sideLength;
  // int sidelenght for getting
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
  // getting the square this.side.lenght for this

    @Override
  // drawing function
    public void draw() {
        System.out.println("Drawing a square with side length " + sideLength);
    }
}
// abstract class for shapedecor for this
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
// coloreedshapedecorator extending for it
public class ColoredShapeDecorator extends ShapeDecorator {
    private String color;
  // getting coloredshapedecor for it
    public ColoredShapeDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
  // function draw for that
    public void draw() {
        super.draw();
        System.out.println("Coloring the shape with color " + color);
    }
}
// decoratorpatternexakple for that and its main class
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        circle.draw();
      // drawing the circle for that
        // output: Drawing a circle with radius 10

        Shape coloredCircle = new ColoredShapeDecorator(circle, "Red");
        coloredCircle.draw();

        // drawing a circle with radius 10
        // coloring the shape with color Red

        Shape square = new Square(5);
        square.draw();

        // drawing a square with side length 5

        Shape coloredSquare = new ColoredShapeDecorator(square, "Blue");
        coloredSquare.draw();

        // rawing a square with side length 5
        // coloring the shape with color Blue
    }
}
