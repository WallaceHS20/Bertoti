import java.awt.*;

// Concrete Strategies para diferentes formas
public class CircleStrategy implements DrawingStrategy {
    @Override
    public void draw(Graphics g) {
        g.drawOval(10, 10, 100, 100); // Exemplo de parâmetros
    }
}
