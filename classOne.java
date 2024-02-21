//package Unit2;
//
//
//import javax.swing.*;
//import java.awt.*;
//
//public class classOne {
//    public static void main(String[] args) {
//        JFrame  f= new JFrame("My first application");
//        f.setSize(400,400);
//        f.setResizable(true);
//        f.setLayout(null);
//        f.setLocationRelativeTo(null);
//        f.getContentPane().setBackground(new Color(10,230,34));
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
////        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        f.setVisible(true);
//    }
//}


//package Unit2;
//
//
//import javax.swing.*;
//import java.awt.*;
//
//public class classOne {
//    public static void main(String[] args) {
//        JFrame  f= new JFrame("My Second application");
//        JPanel p =new JPanel();
//        p.setBounds(10,10,150,150);
//        p.setBackground(Color.yellow);
//        JButton b =  new JButton("Click");
////        b.setBounds(100,100,100,30);
//        b.setForeground(Color.BLUE);
//        p.add(b);
//        JPanel p1 = new JPanel();
//        p1.setBounds(0,0,150,150);
//        p1.setBackground(Color.GREEN);
//
//        JLabel l =new JLabel("Name :-");
//        l.setBounds(70,40,50,30);
//        JTextField tf = new JTextField("TextField");
//        tf.setBounds(80,40,50,30);
//        tf.setForeground(Color.RED);
//
//
//        p1.add(l);
//        p1.add(tf);
//        f.add(p);
//        f.add(p1);
//
//
//        f.setSize(400,400);
//        f.setResizable(true);
////        f.setLayout(null);
//        f.setLocationRelativeTo(null);
//        f.getContentPane().setBackground(new Color(10,230,34));
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
////        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        f.setVisible(true);
//    }
//}

//
package Unit2;


import javax.swing.*;
import java.awt.*;

public class classOne {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Second application");
        JButton b = new JButton("CLICK");
        b.setBounds(10, 10, 100, 50); // Set the size of the button
        b.setForeground(Color.BLUE);
        f.add(b);

        // Set the size of the JFrame
        f.setSize(400, 400);

        // Center the JFrame on the screen
        f.setLocationRelativeTo(null);

        // Set the background color of the content pane
        f.getContentPane().setBackground(new Color(10, 230, 34));

        // Set the default close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the JFrame visible
        f.setVisible(true);
    }
}



