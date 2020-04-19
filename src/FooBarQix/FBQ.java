package FooBarQix;

public class FBQ
{
    private String divisibile(int i)
    {
        String s="";
        if(i%3==0)
            s=s+"Foo";
        if(i%5==0)
            s=s+"Bar";
        if(i%7==0)
            s=s+"Qix";
        return s;
    }

    private String contains(int i)
    {
        String s="";
        int c;
        while(i>0)
        {
            c=i%10;
            i=i/10;

            if(c==3)
                s=s+"Foo";
            if(c==5)
                s=s+"Bar";
            if(c==7)
                s=s+"Qix";
            if(c==0)
                s=s+"*";
        }
        return s;
    }

    public String compute(int i)
    {
        String s= divisibile(i)+contains(i);
        if(s.isEmpty())
            s=String.valueOf(i);
        return i + "=>" + s;
    }

}
