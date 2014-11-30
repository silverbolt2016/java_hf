import javax.swing.*;
import java.awt.*; // For the Graphics class

class MyDrawPanelRect extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        // Leave x, y == 0,0 for now.  When not zero I dont know what the behavior is
        // Sometime the rectangle appears and at other time it does not.  To be investigated
        g.fillRect(0, 0, 50, 50); 
    }
}

class MyDrawPanelOval extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        System.out.print("height , width ");
        System.out.println(this.getHeight() + " , " + this.getWidth());
        // Think of g as a painter who you can tell how and what to paint
        g.setColor(Color.green);
        // width = 100, height = 50
        g.fillOval(0, 0, 100, 50);
    }
}

/**
 * The GuiTest class was written for educational purposes to allow me to 
 * explore working with Guis
*/
public class GuiTest {

    public static void main(String[] args) {
        GuiTest gui = new GuiTest();
        gui.go();
        
    }
    
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
        // The Panel is being added to the default content pane which is the center pane
        frame.getContentPane().add( new MyDrawPanelRect());        
        */
        MyDrawPanelRect rectNorth = new MyDrawPanelRect();
        MyDrawPanelRect rectSouth = new MyDrawPanelRect();
        MyDrawPanelRect rectEast = new MyDrawPanelRect();
        
        MyDrawPanelOval ovalWest = new MyDrawPanelOval();
        MyDrawPanelOval ovalCenter = new MyDrawPanelOval();
        
        frame.getContentPane().add(BorderLayout.NORTH, rectNorth);
        frame.getContentPane().add(BorderLayout.SOUTH, rectSouth);
        frame.getContentPane().add(BorderLayout.EAST, rectEast);
        
        frame.getContentPane().add(BorderLayout.WEST, ovalWest);
        frame.getContentPane().add(BorderLayout.CENTER, ovalCenter);

        frame.setSize(600, 600);
        frame.setVisible(true);
    }

}