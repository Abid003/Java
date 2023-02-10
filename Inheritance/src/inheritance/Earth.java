
package inheritance;

class Earth {
    private String a = "alive";
     public void get_a()
    {
       
        System.out.println(a);
    }
    public void alive()
    {
        
        System.out.println("The Object is alive");
    }
    
}
class Animals extends Earth{
    private String a = "animal";
    public void get_a()
    {
       
        System.out.println(a);
    }
    public void walk()
    {
    
        System.out.println("can walk");
    }
}

class Plant extends Earth{
   private String a = "palnt";
    public void get_a()
    {
     
        System.out.println(a);
    }
    public void walk()
    {
    
        
        System.out.println("can't walk");
    }
    
    
    public static void main(String[] args) {
        
    }
}