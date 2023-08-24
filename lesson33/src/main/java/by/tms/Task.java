package by.tms;

import javax.persistence.*;

@Entity
@Table (name = "tasks")
public class Task {

    @Id
    private Integer id;
    private String name;
    private String description;
    @Enumerated (EnumType.STRING)
    private TaskStatus status;

    public Task() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
