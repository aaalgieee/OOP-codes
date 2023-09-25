package polymorph;

public class Boy extends Human{

    public void walk(){
        System.out.println("Boy Walks");
    }

    public static void main(String[] args) {

        Human obj = new Boy();
        obj.walk();

        Human obj2 = new Human();
        obj2.walk();
    }
}
