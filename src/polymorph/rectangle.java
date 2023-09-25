package polymorph;

public class rectangle extends shapeWsides{
    private int length, width, areaRect;

   public rectangle(int a, int b){
       length = a;
       width = b;
   }

   @Override
    public void computeArea(){
        areaRect = length * width;
        this.setArea(areaRect);
        this.print();
    }
}
