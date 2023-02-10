
package showmessagedialog;
import javax.swing.JOptionPane;

public class Input2parametere {    //4 parametere position and message
    public static void main(String[] args) {
        
       
      
      String name =  JOptionPane.showInputDialog(null,"enter the password","title",JOptionPane.WARNING_MESSAGE);
      
      
   
     
  
        for (int j = 0; j < 3; j++) {
           
           if("password".equals(name))
            {
                 JOptionPane.showMessageDialog(null,"correct password");
                 break;
            }
            else if(j==2)
            {
               JOptionPane.showMessageDialog(null,"Wrong password Try again later","title",JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showInputDialog(null,"enter correct password","title",JOptionPane.ERROR_MESSAGE);
            }
        }
    
    }
}
