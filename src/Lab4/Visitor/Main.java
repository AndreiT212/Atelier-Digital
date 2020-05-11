package Lab4.Visitor;

public class Main
{
    public static void main(String[] args) {
        Element[] elements=new Element[4];

        Book b=new Book(10,3);
        Book b2=new Book(12,4);
        Video v=new Video(5,10);
        Audio a=new Audio(5,5);

        elements[0]=b;
        elements[1]=b2;
        elements[2]=v;
        elements[3]=a;
        Visitor visitor=new CostVisitor();
        System.out.println(((CostVisitor) visitor).getTotalCost());


    }
}
