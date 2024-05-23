import javax.swing.*;

public class FocusableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Focusable Example");

        // Create a button
        JButton button = new JButton("Click Me!");
        
        // Set the button to be focusable
        button.setFocusable(true);

        // Add the button to the frame
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 200);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



