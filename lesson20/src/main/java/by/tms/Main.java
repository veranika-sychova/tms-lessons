package by.tms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/schema";
        String username = "mysql";
        String password = "mysql";

        try (Connection connection = DriverManager.getConnection(URL, username, password)) {

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from students");

            while (resultSet.next()) {
                int idStudent = resultSet.getInt("id_student");
                String nameStudent = resultSet.getString("name_student");
                String gender = resultSet.getString("gender");
                int age = resultSet.getInt("age");
                System.out.println(idStudent + " " + nameStudent + " " + gender + " " + age);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
