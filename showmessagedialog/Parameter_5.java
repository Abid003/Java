

//Show diaog message using 2 parameter

package showmessagedialog;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Parameter_5 {       // location, message, title, icon, image;
    public static void main(String[] args){
        
        ImageIcon img = new ImageIcon("robot.jpg");
    JOptionPane.showMessageDialog(null,"this is message parameter","Title",JOptionPane.PLAIN_MESSAGE,img);
}
}

