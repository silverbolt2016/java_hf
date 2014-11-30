import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BorLayout {
    JFrame frame = new JFrame("Border Layout demo");
    JButton b1 = new JButton("N");
    JButton b2 = new JButton("S");
    JButton b3 = new JButton("C");
    JButton b4 = new JButton("W");
    JButton b5 = new JButton("E");
    
    
    public BorLayout() {
        //frame.setLayout( new BorderLayout());
        frame.getContentPane().add(b1, BorderLayout.NORTH);
        frame.getContentPane().add(b2, BorderLayout.SOUTH);
        frame.getContentPane().add(b3, BorderLayout.CENTER);
        frame.getContentPane().add(b4, BorderLayout.WEST);
        frame.getContentPane().add(b5, BorderLayout.EAST);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        BorLayout gui = new BorLayout();
    }
}