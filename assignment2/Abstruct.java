package assignment2;

public class Abstruct {

    public static abstract class Car {
        public abstract void details();
    }

    public static class Bmw extends Car {
      
        public void details() {      
            System.out.println("Bmw car");
        }   

    }

    public static class Nissan extends Car {
     
        public void details() {
            System.out.println("Nissan car");
        }
  
       
    }
    public static void main(String[] args) {
        Bmw b = new Bmw();
        b.details();
        
        Nissan n = new Nissan();
        n.details();
    }
}
