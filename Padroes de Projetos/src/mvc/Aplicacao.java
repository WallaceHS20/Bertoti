package mvc;

public class Aplicacao {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);

        controller.addTask("Fazer compras");
        controller.addTask("Estudar Java");
        controller.addTask("Ler um livro");

        controller.updateView();
    }
}
