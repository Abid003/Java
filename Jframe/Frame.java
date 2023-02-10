
package Jframe;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame{
    
    private ImageIcon icon;
    Frame(){
     initComponents();   
    }
    public void initComponents()
    {
        icon = new ImageIcon(getClass().getResource("robot.jpg"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        
       Frame frame = new Frame();
        
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     ///  frame.setSize(500, 400);
       frame.setTitle("Title");
      
       
       frame.setBounds(500, 400, 500, 400);
       
        
    }
}
