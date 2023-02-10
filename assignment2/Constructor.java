package assignment2;

public class Constructor {

    public static class Person {

        String name;
        int age;
       

        Person() {
            System.out.println("its a default constructor");
        }

        Person(String n, int a) {
            name = n;
            age = a;
           
            System.out.println("name = " + name);
            System.out.println("age = " + age);
        }
    }

    public static void main(String[] args) {
     Person i = new Person();
     Person st1 = new Person("Rahim",32);

    }
}
