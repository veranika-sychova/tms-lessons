package by.tms.homework;

import java.util.List;

public class EmployeeService {

    public static boolean hasPrimarySubordinate(Director director, String subordinateLastName) {
        if (subordinateLastName == null) {
            System.out.println("Last name can not be null");
            return false;
        }
        List<Worker> subordinates = director.getSubordinates();
        for (Worker subordinate : subordinates) {
            String name = subordinate.getLastName();
            if (name.equals(subordinateLastName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSubordinate(Director director, String subordinateLastName) {
        if (subordinateLastName == null) {
            System.out.println("Last name can not be null");
            return false;
        }
        List<Worker> subordinates = director.getSubordinates();
        for (int i = 0; i < subordinates.size(); i++) {
            Worker current = subordinates.get(i);
            String name = current.getLastName();
            if (subordinateLastName.equals(name)) {
                return true;
            } else if (current instanceof Director) {
                if (hasSubordinate((Director) current, subordinateLastName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
