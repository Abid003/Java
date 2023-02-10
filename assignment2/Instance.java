package assignment2;

public class Instance {

    public static class Person {

        String name;
        double height;

        Person(String n, double h) {
            height = h;
            name = n;
        }

        void displyInfo() {
            
            System.out.println("name = " +name);
                System.out.println("height = " +height);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("karim",1.8);
        p1.displyInfo();
    }
}
