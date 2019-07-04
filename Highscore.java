/*
Date - 04 July 2019
Author - rpetwal

*/

/*
 ** this class will open the highscore dialog box
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Highscore extends JFrame implements ActionListener
{
    JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10;
    JLabel Extra1;
    int easy,medium,hard;
    String ename,mname,hname;
    Highscore(String ename,String mname,String hname,int easy,int medium,int hard)
    {
        this.ename = ename;
        this.mname = mname;
        this.hname = hname;
        this.easy = easy;
        this.medium = medium;
        this.hard = hard;
        setLayout(new FlowLayout());
        setSize(250,250);
        L1 = new JLabel("<html><h2><u><b><marquee>     HIGH SCORES!            </marquee></b></u></h2></html>");
        add(L1);
        L2 = new JLabel("<html><h3>          EASY:</h3><html>");
        add(L2);
        L3 = new JLabel("<html><h3>"+ename+" </h3></html>");
        add(L3);
        L4 = new JLabel("<html><h3>"+easy+"          </h3></html>");
        add(L4);
        L5 = new JLabel("<html><h3>          MEDIUM:</h3></html>");
        add(L5);
        L6 = new JLabel("<html><h3>"+mname+"  </h3></html>");
        add(L6);
        L7 = new JLabel("<html><h3>"+medium+"         </h3></html>");
        add(L7);
        L8 = new JLabel("<html><h3>HARD:</h3></html>");
        add(L8);
        L9 = new JLabel("<html><h3>"+hname+"  </h3></html>");
        L10 = new JLabel("<html><h3>"+hard+"</h3></html>");
        add(L9);
        add(L10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}