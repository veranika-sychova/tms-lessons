package by.tms.model;

public class Task {

    private String text;
    private TaskStatus taskStatus;

    public Task(String text, TaskStatus taskStatus) {
        this.text = text;
        this.taskStatus = taskStatus;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
