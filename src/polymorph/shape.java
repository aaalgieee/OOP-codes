package polymorph;

public class shape {
    private double area, side, length, width;

    public shape (double a){
        side = a;
        area = a * a;
    }

    public shape (double a, double b){
        length = a;
        width = b;
        area = a * b;
    }
    
    public double getArea(){
        return area;
    }

    public double getSide(){
        return side;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }
}
