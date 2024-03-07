package Unit2;


import javax.swing.*;
import java.awt.*;

class Display extends Canvas{
    public void paint(Graphics g){
        Font f = new Font("Dialog",Font.BOLD,20);
        g.setFont(f);
        g.drawString("jai",20,20);

        setBackground(Color.cyan);
        g.fillRect(50,50,200,150);
        g.fillOval(100,100,300,200);

    }
}
public class ClassSix {


    public static void main(String[] args) {
        Display d = new Display();
        JFrame f = new JFrame("Graphics application");
        f.setSize(400,400);
        f.add(d);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.getContentPane().setBackground(Color.BLUE);
        f.setVisible(true);
    }
}
