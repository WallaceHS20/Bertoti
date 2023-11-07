package mvc;

import java.util.List;

public class TaskController {
    private TaskModel model;
    private TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void addTask(String task) {
        model.addTask(task);
    }

    public void updateView() {
        List<String> tasks = model.getTasks();
        view.printTasks(tasks);
    }
}
