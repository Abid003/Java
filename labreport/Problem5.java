package labreport;
public class Problem5 {
   public static class  Animal {

        public void def() {
            System.out.println("An animal");
        }
    }
    public static class Horse extends Animal {
        Horse() {
            System.out.println("Horse rans faster");
        }
    }
    public static class Dog extends Animal {
        Dog() {
            System.out.println("dog bucks");
        }
    }
    public static class Cat extends Animal {
        Cat() {
            System.out.println("cat eats fishess");
        }
    }
    public static void main(String[] args) {
        Animal horse, cat, dog;
        horse = new Horse();
        horse.def();
        System.out.println("");
        dog = new Dog();
        dog.def();
        System.out.println("");
        cat = new Cat();
        cat.def();
    }
}
