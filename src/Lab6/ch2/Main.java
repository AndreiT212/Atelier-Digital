package Lab6.ch2;

public class Main
{
    public static void main(String[] args)
    {
        Running rl=new Running("red",4);
        Running rr=new Running("red",4);
        Heels hr=new Heels("blue",5);

        try {
            Pair<Running> runningPair=new Pair<Running>(rl,rr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
