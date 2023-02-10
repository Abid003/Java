package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay2 extends JFrame implements ActionListener, KeyListener {

    private final int HEIGHT = 400;
    private final int WIDTH = 600;

    private boolean play = false;

    private Timer timer;
    private int delay = 15;

    private int lrPos = 300;
    private int udPos = 200;

    private int ballPosx = 200;
    private int ballPosy = 200;

    private int ballDirx = -1;
    private int ballDiry = -2;

    GamePlay2() {
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

        //basket
      //  g.setColor(Color.yellow);
        //g.drawOval(lrPos, 350, 25, 10);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        timer.start();

        if (play) {

            ballPosx += ballDirx;
            ballPosy -= ballDiry;

            if (ballPosx < 20) {
                ballDirx = -ballDirx;

            }
            if (ballPosy < 20) {
                ballDiry = -ballDiry;

            }
            if (ballPosy> 390) {
                ballDiry = -ballDiry;

            }
               
            if (ballPosx > 590) {
                ballDirx = -ballDirx;

            }
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (lrPos >= 590) {
                lrPos = 590;
            } else {
                moveRight();
            }

        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            if (lrPos <= 0) {
                lrPos = 0;
            } else {
                moveLeft();
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    public void moveRight() {
        play = true;
        lrPos += 5;

    }

    public void moveLeft() {
        play = true;
        lrPos -= 5;
    }

    public static void main(String[] args) {

        GamePlay2 frame = new GamePlay2();
        frame.setTitle("UseLess");
        frame.setBounds(500, 400, 600, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
