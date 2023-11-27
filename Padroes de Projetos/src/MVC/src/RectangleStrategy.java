import java.awt.*;

public class RectangleStrategy implements DrawingStrategy {
    @Override
    public void draw(Graphics g) {
        g.drawRect(10, 10, 100, 50); // Exemplo de parâmetros
    }
}
