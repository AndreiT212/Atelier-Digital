package Box;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter(10,100,"Figter A");
        Fighter f2=new Fighter(12,100,"Fighter B");
        
        BoxingMatch bm=new BoxingMatch(f1,f2);
        System.out.println("");
        System.out.println("fighterA vs figterB"+bm.fight());
    }

}
