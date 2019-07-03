/*
Date - 02 July 2019
Author - rpetwal

*/

/*
This class displays the help dialog box
*/

import java.awt.*;
import javax.swing.*;


public class Help extends JFrame  {
    JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9;
    Help()
    {
        setLayout(new FlowLayout());
        setSize(400,350);
        L1 = new JLabel("Instructions:");
        L2 = new JLabel("This game is pretty simple. It has three difficulty modes ");
        L3 = new JLabel("like every other game, easy, medium and hard. The computer ");
        L4 = new JLabel("will guess a random number between 1 to 10 in easy mode, 1 ");
        L5 = new JLabel("to 50 in medium mode and 1 to 100 in hard mode. Your task is ");
        L6 = new JLabel("guess the number you'll get 7 chances to guess the number ");
        L7 = new JLabel("for every wrong guess you'll lose a chance but the computer ");
        L8 = new JLabel("will tell you whether your guess was lower or greater than the ");
        L9 = new JLabel("generated number. So good luck!");
        add(L1);
        add(L2);
        add(L3);
        add(L4);
        add(L5);
        add(L6);
        add(L7);
        add(L8);
        add(L9);
        setVisible(true);
    }
}
