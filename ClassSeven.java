package Unit2;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class ClassSeven extends Frame implements MouseListener {
    ClassSeven() {
        addMouseListener(this);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.green);
        g.fillOval(e.getX(), e.getY(), 40, 40);

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
//        new ClassSeven();
        new mouseactions();
    }
}
    class mouseactions extends Frame implements MouseMotionListener{

        mouseactions() {
            addMouseMotionListener(this);
            setSize(500,600);
            setLocationRelativeTo(null);
            setLayout(null);
            setVisible(true);
        }
        public void mouseDragged(MouseEvent e){
            Graphics g = getGraphics();
            g.setColor(Color.blue);
            g.fillRect(e.getX(),e.getY(),30,30);
        }
        public void mouseMoved(MouseEvent e){

        }

    }

