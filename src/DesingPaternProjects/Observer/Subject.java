package DesingPaternProjects.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    private List<Observer> observers=new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void notifyObservers()
    {
        for(Observer observer:observers)
        {
            observer.update();
        }
    }

    public void addObserver(Observer o)
    {
        observers.add(o);
    }

    public void delObserver(Observer o)
    {
        if(observers.contains(o))
            observers.remove(o);
    }
}
