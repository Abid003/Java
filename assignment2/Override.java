package assignment2;

public class Override {
    public static class Bank{
        public void bank(){
            System.out.println("this is inside bank class");
        }
    }
      public static class Child extends Bank{
        public void bank(){
            System.out.println("now the method of bank class is overridden");
        }
    }
      
      public static void main(String[] args) {
        Child c = new Child();
        c.bank();
        
        Bank b = new Bank();
        b.bank();
    }
}
