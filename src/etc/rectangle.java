package etc;

public class rectangle {
    private int length, width, perimeter, area;

    public void setLength(int a) {
        length = a;
    }

    public void setWidth(int a) {
        width = a;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void computeArea() {
        area = length * width;
    }

    public void computePerimeter() {
        perimeter = 2 * length + 2 * width;
    }

    public int getArea() {
        return area;
    }

    public int getPerimiter() {
        return perimeter;
    }

    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.length =4;
        rect.width = 2;
        rect.computeArea();
        rect.computePerimeter();

        System.out.println("area: "+rect.area);
        System.out.println("perimeter: "+rect.perimeter);
    }
}
