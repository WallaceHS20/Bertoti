import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class DrawingView extends JFrame implements Observer {
    private JButton drawCircleButton = new JButton("Draw Circle");
    private JButton drawRectangleButton = new JButton("Draw Rectangle");
    private JPanel drawingPanel = new JPanel();
    private JLabel statusLabel = new JLabel("Ready to draw!");

    public DrawingView() {
        // Configuração da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());

        // Configuração do painel de desenho e do rótulo de status
        drawingPanel.setBackground(Color.WHITE);
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(statusLabel, BorderLayout.CENTER);

        // Adicionando componentes
        this.add(drawCircleButton, BorderLayout.NORTH);
        this.add(drawRectangleButton, BorderLayout.SOUTH);
        this.add(drawingPanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.PAGE_END);
    }

    public void addDrawCircleListener(ActionListener listener) {
        drawCircleButton.addActionListener(listener);
    }

    public void addDrawRectangleListener(ActionListener listener) {
        drawRectangleButton.addActionListener(listener);
    }

    public void setStatusText(String text) {
        statusLabel.setText(text);
    }

    @Override
    public void update(Observable o, Object arg) {
        drawingPanel.repaint();
        setStatusText("Shape added. Total shapes: " + ((CompositeShape)o).getShapesCount());
    }

    public JPanel getDrawingPanel() {
        return drawingPanel;
    }
}
