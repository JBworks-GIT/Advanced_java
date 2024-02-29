package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class ClassFour {
    JFrame f;

    ClassFour() {
        f = new JFrame("Grid Layout");
        JButton b1 = new JButton("1");
        b1.setBounds(10, 15, 40, 20);
        JButton b2 = new JButton("2");
        b2.setBounds(15, 15, 40, 20);
        JButton b3 = new JButton("3");
        b3.setBounds(20, 15, 40, 20);
        JButton b4 = new JButton("4");
        b4.setBounds(25, 15, 40, 20);
        JButton b5 = new JButton("5");
        b5.setBounds(30, 15, 40, 20);
        JButton b6 = new JButton("6");
        b6.setBounds(35, 15, 40, 20);
        JButton b7 = new JButton("7");
        b7.setBounds(40, 15, 40, 20);
        JButton b8 = new JButton("8");
        b8.setBounds(45, 15, 40, 20);
        JButton b9 = new JButton("9");
        b9.setBounds(50, 15, 40, 20);
        JButton b10 = new JButton("0");
        b10.setBounds(55, 15, 40, 20);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(3, 3, 10, 20));
        f.setVisible(true);
    }


    static class  KeyEvents implements KeyListener {
        JFrame f;
        JLabel l;
        JTextArea ta;

        KeyEvents() {
            f = new JFrame("Key events");
            l = new JLabel();
            l.setBounds(10, 20, 120, 30);
            ta = new JTextArea();
            ta.setBounds(30, 50, 200, 130);
            ta.addKeyListener(this);
            f.add(l);
            f.add(ta);
            f.setSize(400, 400);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(null);
            f.setVisible(true);
        }

        public void keyPressed(KeyEvent e) {
            l.setText("Key Pressed");
        }

        public void keyReleased(KeyEvent e) {
            l.setText("Key Released");
        }

        public void keyTyped(KeyEvent e) {
            l.setText("Key Typed");
        }
    }

    public static void main(String[] args) {
        new ClassFour();
        new scroll();
        new KeyEvents();
    }

}




    class scroll{
    JFrame f  ;
    scroll(){
        f = new JFrame("JTable and JScrollPane");
        String data[][] ={{"101","Shruti","678"},
                {"102","Yash","762"},
                {"103","garv","678"},
                {"104","Sna","678"},
                {"105","udita","678"},
                {"106","reet","678"}
        };
        String col[] = {"Empid","Empname","Empsale"};
        JTable tb = new JTable(data,col);
        JScrollPane sp = new JScrollPane(tb);
        sp.setBounds(30,40,200,100);
        f.add(sp);
        f.setSize(500,500);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.blue);
        f.setVisible(true);
    }}

    class KeyEvents implements KeyListener{
        JFrame f;
        JLabel l;
        JTextArea ta;
        KeyEvents()
        {
            f=new JFrame("Key events");
            l=new JLabel();
            l.setBounds(10,20,120,30);
            ta=new JTextArea();
            ta.setBounds(30,50,200,130);
            ta.addKeyListener(this);
            f.add(l);
            f.add(ta);
            f.setSize(400,400);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(null);
            f.setVisible(true);
        }
        public void keyPressed(KeyEvent e)
        {
            l.setText("Key Pressed");
        }
        public void keyReleased(KeyEvent e)
        {
            l.setText("Key Released");
        }
        public void keyTyped(KeyEvent e)
        {
            l.setText("Key Typed");
        }
    }

