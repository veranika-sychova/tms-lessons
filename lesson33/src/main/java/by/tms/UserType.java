package by.tms;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum UserType {
    @Enumerated (EnumType.STRING)

    USER,
    ADMIN,
    SUPPORT
}

