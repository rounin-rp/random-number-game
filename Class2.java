
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/*
Date - 02 July 2019
Author - rpetwal

*/

class Class2 extends JFrame implements ActionListener
{
    int highscore;
    JButton B;
    JTextField T1,T2;
    JLabel L1,L2,L3;
    String diff;
    Class2(String diff)
    {
        this.diff = diff;
        highscore = 0;
        setLayout(new FlowLayout());
        setSize(300,300);
        B = new JButton("OK");
        T1 = new JTextField(3);
        T2 = new JTextField(8);
        L1 = new JLabel("Enter number : ");
        L1.setVerticalAlignment(SwingConstants.CENTER);
        L2 = new JLabel("<html></br>Result :</html>");
        L3 = new JLabel("<html><p1>"+this.diff+" mode <br/></p1></html>");
        L3.setHorizontalAlignment(SwingConstants.CENTER);
        L3.setVerticalAlignment(SwingConstants.TOP);
        add(L3);
        add(L1);
        add(T1);
        add(L2);
        add(T2);
        add(B);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}