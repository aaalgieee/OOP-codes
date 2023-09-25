package polymorph;

public class shapeImplementation extends shape {
    
    public shapeImplementation (double a){
        super(a);
    }

    public shapeImplementation (double a, double b){
        super(a, b);
    }
    public static void main(String[] args) {
        shapeImplementation square = new shapeImplementation(4);
        System.out.println("The area of the square having a side of " + square.getSide() + " is " + square.getArea() + ".");
        
        shapeImplementation rectangle = new shapeImplementation(5, 10);
        System.out.println("The area of the rectangle having a length of " + rectangle.getLength() + " and a width of " + rectangle.getWidth() + " is " + rectangle.getArea() + ".");
    }
}
