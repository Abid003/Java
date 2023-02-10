package BrickBreaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;

public class BrickBreaker extends JFrame implements KeyListener, ActionListener {

    private boolean play = false;

    private JPanel panel;
    private Border border;

    private final int HEIGHT = 400;
    private final int WIDTH = 600;

    private int blockHeigth = 0;
    private int blockWidth = 0;
    private int spaceH = 0;
    private int spaceW = 0;
    private int x = 20;
    private int y = 30;

    private int stickPosX = 220;

    private int ballPosX = 300;
    private int ballPosY = 250;
    private int ballDirX = -1;
    private int ballDirY = -2;

    private Timer timer;
    private int delay = 10;

    BrickBreaker() {
        initComponents();
    }

    public void paint(Graphics g) {  /// graphical Expression
        // draw border
        //  g.drawRect(10, 15, WIDTH - 20, HEIGHT - 30);

        ///Draw Bricks
        /*   for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 21; j++) {
                 g.setColor(Color.MAGENTA);
             }
                  g.fillRect(x+spaceH+ blockHeigth , y+spaceW+ blockWidth, 20, 20);

               spaceH = spaceH + 2;
               blockHeigth = blockHeigth +20;
              
 
             }
            spaceW = spaceW + 2;
            blockWidth =  blockWidth +20;
             blockHeigth = 0;
             spaceH = 0;
         */
        // draw the ball
        // g.drawOval(100, 200, 10, 10);
        //draw the stick and find its position
        //g.drawRect(stickPosX, HEIGHT - 27, 50, 10);
        //g.dispose();
        g.setColor(Color.black);//layout
        g.fillRect(0, 10,WIDTH, HEIGHT);

        //border
        /*g.setColor(Color.yellow);
        g.fillRect(10, 10, 5, 350);
        g.fillRect(10, 25, 575, 5);
        g.fillRect(580, 10, 5, 350);
        g.fillRect(10, 360, 575, 5);*/

        //the ball
        g.setColor(Color.RED);
        g.fillOval(ballPosX, ballPosY, 10, 10);
        //the stick
        g.setColor(Color.GREEN);
        g.fillRect(stickPosX, 380, 50, 10);
        g.dispose();

    }

    public void initComponents() {
        this.setBounds(400, 200, WIDTH, HEIGHT);
        this.setTitle("BrickBreaker");
        this.setResizable(false);

        panel = new JPanel();
        this.add(panel);

        addKeyListener(this);
        setFocusable(true);

        timer = new Timer(delay, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {

        timer.start();
        if (play) {
            if (new Rectangle(ballPosX, ballPosY, 10, 10).intersects(new Rectangle(stickPosX, 380, 50, 10))) {
                ballDirY = -ballDirY;
            }
            ballPosX += ballDirX;
            ballPosY -= ballDirY;

            if (ballPosX < 10) {
                ballDirX = -ballDirX;

            }
            if (ballPosY < 15) {
                ballDirY = -ballDirY;

            }
            if (ballPosX > WIDTH-20) {
                ballDirX = -ballDirX;

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
            if (stickPosX >= 520) {
                stickPosX = 520;
            } else {
                moveRight();
            }
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            if (stickPosX <= 20) {
                stickPosX = 20;
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
        stickPosX += 20;

    }

    public void moveLeft() {
        play = true;
        stickPosX -= 20;

    }

    public static void main(String[] args) {
        BrickBreaker frame = new BrickBreaker();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
