package assignment2;

public class MethodOverload {

    public static class Person {

        String name;
        int age;
        double height;

        public void displayInfo(String name) {
            this.name = name;

            System.out.println("name = " + name);
        }

        public void displayInfo(String name, int age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;

            System.out.println("Name " + name);
            System.out.println("age " + age);
            System.out.println("height " + height);
        }
    }

    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person();
        
        a.displayInfo("Rahim");
        b.displayInfo("karim",21,1.9);
    }

}
