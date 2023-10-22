public class Hole {
    private double radius;

    public Hole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(Peg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}