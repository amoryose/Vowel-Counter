// 7/13/14
// Avraham Moryosef
// This program will count the number of vowels in a sentence
// GUI format

package vowels;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Vowel_Counter extends JFrame implements ActionListener
{
    // what is on the screen
    private JLabel intro;
    private JTextField option;
    private JTextArea display;
    private JButton vowel, quit;

    public Vowel_Counter()
    {
       // screen layout 
       intro = new JLabel ("Write a sentence in the box", SwingConstants.LEFT);
       option = new JTextField(20);
       display = new JTextArea( 20 , 10);
       vowel = new JButton ("Vowels");
       quit = new JButton ("Quit");
       setTitle("Number Of Vowels");
       
       Container c = getContentPane();
       setSize(500,300);
       c.setLayout(null);
       
       vowel.addActionListener(this);
       quit.addActionListener(this);
       
       intro.setSize(200,30);
       option.setSize(200, 30);
       display.setSize(400, 50);
       vowel.setSize(150, 100);
       quit.setSize(150, 100);
       
       intro.setLocation(10, 10);
       option.setLocation(200, 10);
       display.setLocation(30, 60);
       vowel.setLocation(50, 150);
       quit.setLocation(250, 150);
       
       c.add(intro);
       c.add(option);
       c.add(display);
       c.add(vowel);
       c.add(quit);
       
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main (String [] args)
    {
    	Vowel_Counter  vowelCounter= new Vowel_Counter();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String sentence;
        if (e.getActionCommand().equals("Vowels"))
        {
            sentence = option.getText().toLowerCase();
        
            // numVowels is set to 0 to begin the count
            int numVowels = 0;
            
            // the length of the sentence 
            for (int x = 0; x < sentence.length(); x++)
            {
                // calls to check the method isVowel
                if(isVowel(sentence.charAt(x)))
                    numVowels++;
            

            }
       
            // outputs the result
            display.setText("There were " + numVowels + 
                    " vowels found in the sentence: \n" + sentence);
        }
        
        if(e.getActionCommand().equals("Quit"))
        {
            System.exit(0);
        }
     }
  
    // isVowel method
    public static boolean isVowel(char ch)
    {
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')
         {
            return true;
         }
            return false;
    }
}   
