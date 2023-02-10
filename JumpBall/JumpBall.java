package JumpBall;

import Tennis.GamePlay;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class JumpBall extends JFrame implements ActionListener, KeyListener {

    private final int HEIGHT = 400;
    private final int WIDTH = 600;

    private boolean play = false;

    private Timer timer;
    private int delay = 15;

    private int lrPos = 300;
    private int udPos = 200;

    private int ballPosx = 200;
    private int ballPosy = 350;

    private int ballDirx = -1;
    private int ballDiry = -2;

    JumpBall() {
        addKeyListener(this);
        setFocusable(true);

        timer = new Timer(delay, this);
        timer.start();

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);//layout
        g.fillRect(0, 0, 600, 400);

        // the ball
        g.setColor(Color.red);
        g.fillOval(ballPosx, ballPosy, 15, 15);
    }

    public void jump() {

        ballPosy = ballPosy-20;

    }

    public void moveLeft() {
        play = true;
        ballPosx -= 10;

    }

    public void moveRight() {
         play = true;
        ballPosx += 10;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        timer.start();
        repaint();

    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {

        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
            if (ballPosy <= 10) {
                ballPosy = 10;
            } else {
                jump();
            }
        }
        if (ke.getKeyCode() == KeyEvent.VK_D) {
            
            if(ballPosx>= 580)
            {
                ballPosx = 580;
            }
            else 
            {
                moveRight();
                
            }

        }
        if (ke.getKeyCode() == KeyEvent.VK_A) {
              if(ballPosx <= 10)
            {
                ballPosx = 10;
            }
            else 
            {
                moveLeft();
                
            }

        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    public static void main(String[] args) {
        JumpBall frame = new JumpBall();
        frame.setTitle("JumpBall");
        frame.setBounds(500, 400, 600, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
