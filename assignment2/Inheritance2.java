
package assignment2;

public class Inheritance2 {
    
    public static class A{
        
    public void displayA() {
            System.out.println("this method is in A class");
        }
    
    }
    public static class B extends A{
        public void displayB() {
            System.out.println("this method is in B class");
        }
    }
    
      public static class C extends B{
           public void displayC() {
            System.out.println("this method is in C class");
        }
    }
      
      public static void main(String[] args) {
          C c = new C();
          c.displayA();
          c.displayB();
          c.displayC();
    }
}
