package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ca1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("registration");
        JLabel l1 = new JLabel("registration no");
        JLabel l2 = new JLabel("name");
        JLabel l3 = new JLabel("age");
        JLabel l4 = new JLabel("residential address");
        JLabel l5 = new JLabel("documents");
        JLabel l6 = new JLabel("dmc");
        l1.setBounds(10,20,100,20);
        l2.setBounds(10,40,100,20);
        l3.setBounds(10,60,100,20);
        l4.setBounds(10,80,200,20);
        l5.setBounds(10,100,100,20);
        l6.setBounds(10,120,100,20);


        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        JTextField tf4 = new JTextField();
        JTextField tf5 = new JTextField();

        tf1.setBounds(150,20,100,20);
        tf2.setBounds(150,40,100,20);
        tf3.setBounds(150,60,100,20);
        tf4.setBounds(150,80,100,20);
        tf5.setBounds(150,100,100,20);

        JCheckBox cb1 = new JCheckBox("sem1");
        JCheckBox cb2 = new JCheckBox("sem2");
        JCheckBox cb3 = new JCheckBox("sem3");
        JCheckBox cb4 = new JCheckBox("sem4");
        JCheckBox cb5 = new JCheckBox("sem5");

        cb1.setBounds(120, 120, 200, 30);
        cb2.setForeground(Color.black);
        cb2.setBounds(120, 140, 200, 30);
        cb2.setForeground(Color.black);
        cb3.setBounds(120, 160, 200, 30);
        cb3.setForeground(Color.black);
        cb4.setBounds(120, 180, 200, 30);
        cb4.setForeground(Color.black);
        cb5.setBounds(120, 200, 200, 30);
        cb5.setForeground(Color.black);


        JTextArea res = new JTextArea();
        res.setBounds(50, 360, 400, 100);

        JButton b = new JButton("submit");
        b.setBounds(200, 320, 200, 40);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String regNumber = tf1.getText();
                String name = tf2.getText();
                String age = tf3.getText();
                String cgpa = tf4.getText();
                String doc = tf5.getText();

                String docList = "";

                if (cb1.isSelected()) {
                    docList += "sem1 ";
                }
                if (cb2.isSelected()) {
                    docList += "sem2, ";
                }
                if (cb3.isSelected()) {
                    docList += "sem3";
                }
                if (cb4.isSelected()) {
                    docList += "sem4";
                }if (cb5.isSelected()) {
                    docList += "sem5";
                }


                String result = "Registration Number: " + regNumber + "\nName: " + name +
                        "\nAge: " + age + "\nCGPA: " + cgpa + "\ndocuments: " + doc +"\nDMC: " +
                        docList.substring(0, docList.length() - 2);

                res.setText(result);
            }
        });


//        tf1.setBounds(10,10,2,2);
        f.setSize(700,700);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        f.add(b);
        f.add(res);




        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
