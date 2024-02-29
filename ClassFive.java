package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassFive {
    JFrame f ;
    ClassFive()
    {
        f = new JFrame("JList application");
        JLabel l = new JLabel();
        l.setBounds(250,200,190,30);
        l.setForeground(Color.yellow);
        DefaultListModel<String> df = new DefaultListModel<>();
        df.addElement("INDIA");
        df.addElement("JAPAN");
        df.addElement("USA");
        df.addElement("RUSSIA");
        df.addElement("NEPAL");
        df.addElement("SRI LANKA");
        df.addElement("NEW ZEALAND");
        df.addElement("PAKISTAN");
        JList<String> ls = new JList<>(df);
        ls.setBounds(40,10,100,200);
        JButton b = new JButton("COUNTRY");
        b.setBounds(150,150,90,30);
        b.setForeground(Color.yellow);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if(ls.getSelectedIndex()!=-1){
                    data = "Selected Country:- " + ls.getSelectedValue();
                }
                l.setText(data);
            }
        });
        f.add(b);
        f.add(ls);
        f.add(l);
        f.setSize(500,500);
        f.setResizable(false);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLUE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); // should be at last always
    }


        public static class menubar implements ActionListener {
            JFrame f;
            JMenuBar mb;
            JMenu file, edit, help;
            JMenuItem cut, copy, paste, selectAll, save, print;
            JTextArea ta;

            menubar() {
                f = new JFrame("Text editor");
                cut = new JMenuItem("cut");
                copy = new JMenuItem("copy");
                paste = new JMenuItem("paste");
                selectAll = new JMenuItem("selectAll");
                save = new JMenuItem("save");
                print = new JMenuItem("print");

                cut.addActionListener(this);
                copy.addActionListener(this);
                paste.addActionListener(this);
                selectAll.addActionListener(this);

                mb = new JMenuBar();
                file = new JMenu("File");
                edit = new JMenu("Edit");
                help = new JMenu("Help");

                edit.add(cut);
                edit.add(copy);
                edit.add(paste);
                edit.add(selectAll);
                file.add(save);
                file.add(print);

                mb.add(file);
                mb.add(edit);
                mb.add(help);

                ta = new JTextArea();
                ta.setBounds(5, 5, 400, 300);
                f.add(mb);
                f.add(ta);

                f.setJMenuBar(mb);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLayout(null);
                f.setSize(500, 500);
                f.setLocationRelativeTo(null);
                f.setResizable(false);
                f.setVisible(true);
            }

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cut) {
                    ta.cut();
                }

                if (e.getSource() == copy) {
                    ta.copy();
                }

                if (e.getSource() == paste) {
                    ta.paste();
                }

                if (e.getSource() == selectAll) {
                    ta.selectAll();
                }
            }
        }


    public static void main(String[] args) {
        new ClassFive();
        new menubar();
}

}


