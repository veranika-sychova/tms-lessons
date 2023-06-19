package by.tms.lesson7.homework1;

public class Homework1 {
    public static void main(String[] args) {

        Figure[] figures = {new Circle(8), new Rectangle(3,6), new Triangle(4,7,10), new Circle(12), new Rectangle(5,9)};

        double sum = 0;

        for (int i = 0; i < figures.length; i++) {
            sum+= figures[i].calculatePerimeter();
        }

        System.out.println(sum);
    }
}
