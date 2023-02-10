//submitted by 
/*Name = Md. Abidul Haque
ID = 191311156
sec = B
sem = 4th
*/

//submitted to 
/*
 Name = Md Tokey Ahmed
lecturer VU CSE
*/

//date 27-5-2020








//super class
package assignment;

public class Animal {
     
   private String name;
   private double weight;
   private int lives;
    
   Animal(String name, double weight,int lives){
       this.name = name;
       this.weight = weight;
       this.lives =lives;
   }
   
    public void info()
    {
        System.out.println(""+name+"  can move "+"weight = "+weight+"lives "+lives+" years");
    }
   
    public void greeting(){
        System.out.println("can be used in a way");
    }
    
}
