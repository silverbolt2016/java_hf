import javax.swing.*;
import java.awt.event.*;

/**
 * The class SimpleGui1B illustrates basic event handle with a button
 * It was taken from chap12 of the HF Java
*/
public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main (String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
}

        

        
