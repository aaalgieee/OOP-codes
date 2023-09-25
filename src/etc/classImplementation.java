package etc;

public class classImplementation {
    public static void main(String[] args) {
        rectangle ci = new rectangle();
        ci.setLength(4);
        ci.setWidth(2);
        ci.computeArea();
        ci.computePerimeter();
        System.out.println("The Area of the rectangle with a length of " + ci.getLength() + " and width of "
                + ci.getWidth() + " is " + ci.getArea());
        System.out.println("The Perimeter of the rectangle with a length of " + ci.getLength() + " and width of "
                + ci.getWidth() + " is " + ci.getPerimiter());
    }

}
