package Jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public final class VowelCalculation extends JFrame implements ActionListener {

    private Container c;

    private JTextArea ta;
    private JLabel l1;
    private JLabel v;
    private JLabel a;
    private JLabel e;
    private JLabel i;
    private JLabel o;
    private JLabel u;

    private int count_v = 0;
    private int count_a = 0;
    private int count_e = 0;
    private int count_i = 0;
    private int count_o = 0;
    private int count_u = 0;

    private JScrollPane scroll;

    VowelCalculation() {
        initComponents();
    }

    public void initComponents() {
        this.setBounds(100, 150, 600, 500);
        this.setTitle("VowelCalculation");
        this.setResizable(false);

        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        ta = new JTextArea();

        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        c.add(ta);

        scroll = new JScrollPane(ta);
        scroll.setBounds(150, 20, 400, 80);
        c.add(scroll);

        l1 = new JLabel();
        l1.setBounds(10, 50, 100, 50);
        l1.setText("enter the text = ");
        c.add(l1);

        v = new JLabel();
        v.setBounds(50, 110, 100, 50);
        c.add(v);

        a = new JLabel();
        a.setBounds(50, 150, 80, 50);
        c.add(a);

        e = new JLabel();
        e.setBounds(50, 180, 80, 50);
        c.add(e);

        i = new JLabel();
        i.setBounds(50, 210, 80, 50);
        c.add(i);

        o = new JLabel();
        o.setBounds(50, 240, 80, 50);
        c.add(o);

        u = new JLabel();
        u.setBounds(50, 270, 80, 50);
        c.add(u);

        ta.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getSource() == ta) {

                    if (ke.VK_A == ke.getKeyCode()) {
                        count_v++;
                        count_a++;
                    }

                    if (ke.VK_E == ke.getKeyCode()) {
                        count_v++;
                        count_e++;
                    }
                    if (ke.VK_I == ke.getKeyCode()) {
                        count_v++;
                        count_i++;
                    }
                    if (ke.VK_O == ke.getKeyCode()) {
                        count_v++;
                        count_o++;
                    }
                    if (ke.VK_U == ke.getKeyCode()) {
                        count_v++;
                        count_u++;
                    }
                    if (ta.getText() == null) {
                        count_v = 0;
                        count_a = 0;
                        count_e = 0;
                        count_i = 0;
                        count_o = 0;
                        count_u = 0;
                    }

                    v.setText("Total vowel = " + count_v);
                    a.setText("Total a = " + count_a);
                    e.setText("Total e = " + count_e);
                    i.setText("Total i = " + count_i);
                    o.setText("Total o = " + count_o);
                    u.setText("Total u = " + count_u);

                }

            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }

        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

        VowelCalculation frame = new VowelCalculation();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
