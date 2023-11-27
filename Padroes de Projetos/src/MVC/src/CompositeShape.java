import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// Composite Shape
import java.util.Observable;

public class CompositeShape extends Observable {
    private List<Shape> children = new ArrayList<>();

    public void addShape(Shape shape) {
        children.add(shape);
        setChanged(); // Marca que o estado do Observable mudou
        notifyObservers(); // Notifica os observadores
    }

    public void draw(Graphics g) {
        for (Shape shape : children) {
            shape.draw(g);
        }
    }

    public int getShapesCount() {
        return children.size();
    }
}
