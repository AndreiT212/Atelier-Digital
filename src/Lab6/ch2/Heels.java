package Lab6.ch2;

public class Heels implements Shoe
{
    private String color;
    private double size;

    @Override
    public String toString() {
        return "Heels{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public Heels(String color, double size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getSize() {
        return size;
    }
}
