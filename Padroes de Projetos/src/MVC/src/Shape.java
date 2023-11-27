import java.awt.*;

// Componente do Composite
public class Shape {
    protected DrawingStrategy strategy;

    public Shape(DrawingStrategy strategy) {
        this.strategy = strategy;
    }

    public void draw(Graphics g) {
        strategy.draw(g);
    }
}