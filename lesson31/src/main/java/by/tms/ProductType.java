package by.tms;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum ProductType {
    @Enumerated (EnumType.STRING)

    BOOK,
    TOY,
    TECHNIQUE,
    FOOD
}
