import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;

/**
   Creates an array of strings which are then displayed
   as fortunes

   @author  Albert Su
   @version 10/21/2017

   @author  Period - 2
   @author  Assignment - Lab 12.3: Fortune Teller

   @author  Sources - None
 */
public class FortuneTeller extends JApplet implements ActionListener
{
    // Declare an array of "fortunes" (strings):
    private String[] foutune = {"tomorrow has good weather",
        "tomorrow is a good day",
        "you will have nice hair",
        "you will get a B+ in Chemistry Honors",
        "you will be Mr Fulks best friend",
        "you will get an A on tomorrow's test",
        "you will have nice hair",
        "join DECA tomorrow"};

    private JTextField display;
    private AudioClip ding;
    /**
     * initializer method
     */
    public void init()
    {
        ding = getAudioClip(getDocumentBase(), "ding.wav");

        display = new JTextField("  Press \"Next\" to see your fortune...", 30);
        display.setBackground(Color.WHITE);
        display.setEditable(false);

        JButton go = new JButton("Next");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(display);
        c.add(go);
    }
    /**
     * displays the text
     */
    public void actionPerformed(ActionEvent e)
    {
        ding.play();
        int randomFortune = (int)(Math.random()*foutune.length);
        // Pick a random fortune:

        display.setText("  " + foutune[randomFortune]);
    }
}

