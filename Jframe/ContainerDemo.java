
package Jframe;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ContainerDemo extends JFrame {
    
   private Container c;
   private JLabel label1, label2;
   
   
    ContainerDemo()
    {
        initComponents();
    }
    public void initComponents(){
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,500,400);
        this.setTitle("a");
        
       
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        
        
        label1 = new JLabel();
        label1.setText("Enter Your name:  ");
        label1.setBounds(10, 5, 100, 50);

        c.add(label1);
        
         label2 = new JLabel();
        label2.setText("Enter Your password :  ");
        label2.setBounds(10, 60, 100, 50);

        c.add(label2);
       
        
    }
    
    public static void main(String[] args) {
        
        
        ContainerDemo frame = new ContainerDemo();
        frame.setVisible(true);
        
        

    }
}
