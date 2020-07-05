package DesingPaternProjects.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Numbers
{
    private static Map<Integer,Number> intMap=new HashMap<Integer,Number>();
    static
    {
        intMap.put(5,new Five());
        intMap.put(11,new Eleven());
    }

    public static Number getNumber(Integer number)
    {
        return (Number) intMap.get(number).clone();
    }
}
