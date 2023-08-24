package by.tms;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    private String name;
    @Enumerated (EnumType.STRING)
    private UserType type;
    @Id
    private Date birthDate;
    private String gender;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
