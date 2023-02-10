//subclass
package assignment;


public class Horse extends Animal {

    public Horse(String name, double weight, int lives) {
        super(name, weight, lives);
    }

   

     public void properties()
    {
        System.out.println("can move");
        System.out.println("");
    }
     
      public void greeting(){
        System.out.println("it runs fast ");
    }
}
