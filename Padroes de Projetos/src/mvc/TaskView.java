package mvc;

import java.util.List;

public class TaskView {
    public void printTasks(List<String> tasks) {
        System.out.println("Lista de Tarefas:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
