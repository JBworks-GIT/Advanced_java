package Unit2;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
class ClassThree {
ClassThree()    {
        JFrame f=new JFrame("JCheckBox application");
        JLabel l1=new JLabel("Ready to eat");
        l1.setBounds(10,20,150,30);
        l1.setForeground(Color.blue);
        JCheckBox c1=new JCheckBox("Pizza..... Rs.100");
        c1.setBounds(40,40,200,30);
        JCheckBox c2=new JCheckBox("Burger..... Rs.200");
        c2.setBounds(40,100,200,30);

        JButton b=new JButton("ORDER");
        b.setBounds(120,120,100,30);
        b.setForeground(Color.blue);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                float amount=0;
                String msg=" ";
                if(c1.isSelected())
                {
                    amount+=100;
                }
                if(c2.isSelected())
                {
                    amount+=200;
                }
                msg="Total amount will be:- "+amount;
                System.out.println(msg);
            }
        });
        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(b);
        f.setSize(400,400);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.yellow);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ClassThree();
        new textArea();
    }
}

class textArea
{
    textArea()    {
        JFrame f=new JFrame("JtextArea application");
        JLabel l1=new JLabel();
        l1.setBounds(20,40,150,30);
        l1.setForeground(Color.blue);
        JLabel l2=new JLabel();
        l2.setBounds(120,40,150,30);
        l2.setForeground(Color.blue);
        JTextArea ta=new JTextArea();
        ta.setBounds(40,80,200,40);
        ta.setForeground(Color.blue);
        JButton b=new JButton("Count");
        b.setBounds(120,120,100,30);
        b.setForeground(Color.blue);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String text=ta.getText();
                String word[]=text.split("\\s");
                l1.setText("Words:- "+word.length);
                l2.setText("Charcters:- "+text.length());
            }
        });
        f.add(l1);
        f.add(l2);
        f.add(ta);
        f.add(b);
        f.setSize(400,400);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.yellow);
        f.setVisible(true);
    }
}
