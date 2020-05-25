package Lab7.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Car> cars= new ArrayList<Car>();
        cars.add(new Car(1000,2020));
        cars.add(new Car(1000,2019));
        cars.add(new Car(2000,2019));
        cars.add(new Car(900,2020));

        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
}
