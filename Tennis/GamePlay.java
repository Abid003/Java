/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tennis;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JFrame implements ActionListener, KeyListener {

    private final int HEIGHT = 400;
    private final int WIDTH = 600;

    private boolean play = false;

    private Timer timer;
    private int delay = 15;

    private int player1 = 200;
    private int player2 = 200;

    private int score1 = 0;
    private int score2 = 0;

    private int ballPosx;
    private int ballPosy;
    private int ballDirx = -1;
    private int ballDiry = -2;

    GamePlay() {
        addKeyListener(this);
        setFocusable(true);

        timer = new Timer(delay, this);
        timer.start();

        Random n = new Random();
        ballPosx = n.nextInt(300);
        ballPosy = n.nextInt(500);

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);//layout
        g.fillRect(0, 0, 600, 400);

        //player 1
        g.setColor(Color.green);
        g.fillRect(10, player1, 10, 35);

        //player 2
        g.setColor(Color.green);
        g.fillRect(580, player2, 10, 35);

        //the ball
        g.setColor(Color.red);
        g.fillOval(ballPosx, ballPosy, 10, 10);

        /// score player 1
        g.setFont(new Font("areal", Font.BOLD, 15));
        g.setColor(Color.ORANGE);
        g.drawString("player 1 = " + score1, 50, 50);

        /// score player 2
        g.setColor(Color.ORANGE);
        g.drawString("player 2 = " + score2, 450, 50);

        if (ballPosx == 5) {
                 
            score2++;
            play = false;
        
           
        }
        if (ballPosx == 585) {
            score1++;
            play = false;
      

        }

    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
    if(!play){
        if(ballPosx<300)
        {
            ballDirx = -ballDirx;
            ballDiry = -ballDiry;
        }
        }
        if (play) {
            if (new Rectangle(ballPosx, ballPosy, 10, 10).intersects(new Rectangle(10, player1, 10, 35))) {
                ballDirx = -ballDirx;
            }
            if (new Rectangle(ballPosx, ballPosy, 10, 10).intersects(new Rectangle(580, player2, 10, 35))) {
                ballDirx = -ballDirx;
            }
            ballPosx -= ballDirx;
            ballPosy += ballDiry;

            if (ballPosy < 10) {
                ballDiry = -ballDiry;

            }

            if (ballPosy > HEIGHT - 20) {
                ballDiry = -ballDiry;

            }
           
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
      
        
        if (ke.getKeyCode() == KeyEvent.VK_W) {
            if (player1 <= 10) {
                player1 = 10;
            } else {
                moveUp1();
            }

        }
        if (ke.getKeyCode() == KeyEvent.VK_S) {
            if (player1 >= 370) {
                player1 = 370;
            } else {
                moveDown1();
            }
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            if (player2 <= 20) {
                player2 = 20;
            } else {
                moveUp2();
            }
        }

        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            if (player2 >= 370) {
                player2 = 370;
            } else {
                moveDown2();
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    public void moveUp1() {
        play = true;
        player1 -= 5;
    }

    public void moveDown1() {
        play = true;
        player1 += 5;
    }

    public void moveUp2() {
        play = true;
        player2 -= 5;
    }

    public void moveDown2() {
        play = true;
        player2 += 5;
    }

    public void reset() {
        play = false;
        timer.stop();
         repaint();
         Random n = new Random();
        ballPosx = n.nextInt(300);
        ballPosy = n.nextInt(400);
        ballDirx = -1;
        ballDiry = -2;
        player1 = 200;
        player2 = 200;
        timer.start();
       
    }

    public static void main(String[] args) {

        GamePlay frame = new GamePlay();
        frame.setTitle("Day13");
        frame.setBounds(500, 400, 600, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
