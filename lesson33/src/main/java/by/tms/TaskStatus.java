package by.tms;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum TaskStatus {
    @Enumerated (EnumType.STRING)

    NEW,
    IN_PROGRESS,
    DONE
}
