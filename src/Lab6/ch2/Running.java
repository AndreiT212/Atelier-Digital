package Lab6.ch2;

public class Running implements Shoe
{
    private String color;
    private double size;

    @Override
    public String toString() {
        return "Running{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public Running(String color, double size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getSize() {
        return 0;
    }
}
