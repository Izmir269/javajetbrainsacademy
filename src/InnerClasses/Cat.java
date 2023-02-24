package InnerClasses;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public class Bow {
        String color;

        public Bow(String color) {
            this.color = color;
        }

        public void printColor() {
            System.out.println("Cat " + Cat.this.name + " has a " + this.color + " bow.");
        }
    }
}
