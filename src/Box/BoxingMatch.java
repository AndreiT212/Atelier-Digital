package Box;

public class BoxingMatch {
    private Fighter f1;
    private Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String fight()
    {
        String winner=f2.getName();

        while(f1.getHealth()>0)
        {
            System.out.println(f1.getHealth()+" health="+f1.getHealth());
            System.out.println(f1.getHealth()+" health="+f1.getHealth());

            f2.decreaseHealth(f1.getDpm());

            if(f2.getHealth()>0)
                f1.decreaseHealth(f2.getDpm());
            else
                winner = f1.getName();
        }
        return winner;
    }
}
