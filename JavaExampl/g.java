import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import java.util.Random;

 public class ClockGame extends JFrame {

   //Declare fields for GUI components
   private JTextField guessField;
   private JButton newGameButton;
   private JLabel messageLabel;
   private JLabel guessLabel;
   private ImageIcon clockImage;
   private int countTotal;
   private Random rand;
   private JLabel title;
   private int number;
   private Timer timer;

   public ClockGame() {
     //Build GUI
     super ("Clock Game");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     //Set layout
     this.setLayout(new BorderLayout());

     //Create the main panel
     JPanel mainPanel = new JPanel();

     //Create components and place them in the panel
     rand = new Random();

     guessLabel = new JLabel("Guess: ");
     guessField = new JTextField(20);
     messageLabel = new JLabel("                             Click New Game to Begin");
     clockImage = new ImageIcon("clock.jpg");
     newGameButton = new JButton("New Game");
     title = new JLabel("The Clock Game", clockImage, SwingConstants.CENTER);

     //Set font for clockGameLabel
title.setFont(new Font("Calibri", Font.BOLD, 24));

     //Set messageLabel Color
     messageLabel.setOpaque(true);
     messageLabel.setBackground(Color.yellow);

     newGameButton.addActionListener(new ButtonListener());
     guessField.addActionListener(new AnswerListener());

     //Add components to the panel
     mainPanel.add(guessLabel);
     mainPanel.add(guessField);
     mainPanel.add(newGameButton);
     this.add(title, BorderLayout.NORTH);
     this.add(messageLabel, BorderLayout.SOUTH);

     //Add the panel to this JFrame
     this.add(mainPanel, BorderLayout.CENTER);

     //Sizes this JFrame so that it is just big enough to hold the components
     this.setSize(340,225);

     //Make the JFrame visible on the screen
     this.setVisible(true);
   }

   private class AnswerListener implements ActionListener {

     public void actionPerformed(ActionEvent e) {

       //Code to check to see if answer is correct
       int sum = number;
       int answer = Integer.parseInt(guessField.getText());
       Color purple = new Color(153, 153, 253);

       countTotal++;
       if (sum < answer)
       {
         messageLabel.setText("Too High");
         messageLabel.setBackground(Color.red);
       }
       else if (sum > answer)
       {
         messageLabel.setText("Too Low");
         messageLabel.setBackground(purple);
       }
       else
       {
         messageLabel.setText("Correct! It took you " + countTotal + " tries, in " +
                          timer + " seconds");
         messageLabel.setBackground(Color.yellow);
       }
     }
   }

   private class ButtonListener implements ActionListener {

     public void actionPerformed(ActionEvent e) {
       number = rand.nextInt(1001);
       messageLabel.setText("              The price is between $1 and $1000, begin.");
       messageLabel.setBackground(Color.green);
      countTotal = 0;
     }
   }

   public static void main(String[] args) {
     ClockGame frame = new ClockGame();
   }
 }  
