package InnerClasses;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Bob");
        Cat.Bow bow = cat.new Bow("red");

        bow.printColor();
    }

}
