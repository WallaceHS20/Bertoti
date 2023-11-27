public class Main {
    public static void main(String[] args) {
        // Cria o modelo
        CompositeShape model = new CompositeShape();

        // Cria a view
        DrawingView view = new DrawingView();

        // Cria o controlador e passa o modelo e a view para ele
        DrawingController controller = new DrawingController(model, view);

        // Configura a view para observar o modelo
        model.addObserver(view);

        // Exibe a interface do usuário
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                view.setVisible(true);
            }
        });
    }
}
