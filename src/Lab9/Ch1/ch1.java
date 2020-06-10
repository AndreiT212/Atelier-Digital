package Lab9.Ch1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class ch1
{
    @Test
    public void consumer1()
    {
        List<String> list=new ArrayList<>(Arrays.asList("a","b","c"));

     //   Consumer<List<String>> consumer=1 -> 1.clear();
      //  consumer.accept(list);

        Assert.assertEquals(list,new ArrayList<>());
    }
}
