package labreport;
public class Problem6 {  
    public static class Animals{
        
    public void def() {
            System.out.println("is animal");
        }
    }
    public static class Horse extends Animals{
       public void horse_nature(){
           //nature()
           super.def();
           System.out.println("horse eats");
           System.out.println("horse rans fast");
       }     
    }
      public static class Horse_details extends Horse{
        public void details(){
            System.out.println("horse all details");
             super.horse_nature();
        }
    }
      public static void main(String[] args) {
        Horse_details horse;
        horse = new Horse_details();
        horse.details();
    }
}
