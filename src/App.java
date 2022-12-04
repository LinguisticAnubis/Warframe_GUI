
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App implements ActionListener {
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();
    private String itemName;
    private JTextField textField = new JTextField();



    public App() {

        // the window with the button and text
        JPanel window = new JPanel();
        window.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        window.setLayout(new GridLayout(0, 1));

        // Requested an item to scan for
        JLabel textFieldLabel = new JLabel("Insert Item Name: ");
        textField.getPreferredSize();

        // creates the submit button
        JButton submit = new JButton("Submit");
        submit.addActionListener(this);

        // adds each created field above to the window
        window.add(textFieldLabel);
        window.add(textField);
        window.add(submit);

        // set up the frame and display it
        frame.add(window, BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }



    // process the button clicks
    public void actionPerformed(ActionEvent anyEvent) {
        String text = textField.getText();
        System.out.println(text);
    }


    // create one Frame
    public static void main(String[] args) {
        new App();
    }

}