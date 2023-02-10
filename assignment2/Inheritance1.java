package assignment2;

public class Inheritance1 {

   public static class  Animal {

        public void def() {
            System.out.println("its an animal");
        }
    }

    public static class Duck extends Animal {
        Duck() {
            System.out.println("can fly, can swim");
        }
    }

    public static class Crow extends Animal {
        Crow() {
            System.out.println("cat fly, but cant swim");
        }
    }

    public static void main(String[] args) {
       Duck duck = new Duck();
       duck.def();
       Crow crow = new Crow();
       crow.def();
    }
}
