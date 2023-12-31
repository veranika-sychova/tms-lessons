package by.tms.controller.payload;

import javax.validation.constraints.NotEmpty;

public class SearchBookRequest {

    @NotEmpty (message = "Book name cannot be empty")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
