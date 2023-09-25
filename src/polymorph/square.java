package polymorph;

public class square extends shapeWsides{
    private int side, areaSquare;

    public square(int a){
        side = a;
    }

    @Override
    public void computeArea(){
        areaSquare = side * side;
        this.setArea(areaSquare);
        this.print();
    }
}
