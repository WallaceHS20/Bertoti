import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingController {
    private CompositeShape model; // O modelo é um CompositeShape
    private DrawingView view;

    public DrawingController(CompositeShape model, DrawingView view) {
        this.model = model;
        this.view = view;

        view.addDrawCircleListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addShape(new Shape(new CircleStrategy()));
                view.repaint();
            }
        });

        view.addDrawRectangleListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addShape(new Shape(new RectangleStrategy()));
                view.repaint();
            }
        });
    }
}
