package core.basesyntax.core;

public class Circle extends Figure {
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }
}