package polymorph;

public class shapeWsides {
    private int area;

    public int getArea(){
        return area;
    }

    public void setArea(int a){
        area = a;
    }

    public void computeArea(){

    }

    public void print(){
        System.out.println("The area of the shape is " + area + ".");
    }

    public static void main(String[] args) {
        rectangle rect = new rectangle(2,4);
        rect.computeArea();

        square sqr = new square(4);
        sqr.computeArea();
    }
}
