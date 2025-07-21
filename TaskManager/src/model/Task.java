package model;

public class Task {
    private int id;
    private String title;
    private String description;
    private String deadline;
    private boolean completed;
    private int userId;

    public Task(String title, String description, String deadline, int userId) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.completed = false;
        this.userId = userId;
    }

    public Task(int id, String title, String description, String deadline, boolean completed, int userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.completed = completed;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getUserId() {
        return userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + "\n" +
                "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Deadline: " + deadline + "\n" +
                "Completed: " + (completed ? "Yes" : "No");
    }
}