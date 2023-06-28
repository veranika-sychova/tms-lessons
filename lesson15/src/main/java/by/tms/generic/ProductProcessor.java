package by.tms.generic;

public interface ProductProcessor<T> {

    void create(T product);
    void order(T product);
    void delete(T product);


}
