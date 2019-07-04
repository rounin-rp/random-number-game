/*
Date - 02 July 2019
Author - rpetwal

*/

/*
This is the first layout of the game
It will display a screen to write the name of the player 
and also three options easy, medium and hard.
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;




class Class1 extends JFrame implements ActionListener
{
    JButton B1,B2,B3;
    JLabel L1;
    JTextField T1,T2;
    JRadioButton R1,R2,R3;
    Class2 cl2;
    Help help;
    String diff,name;
    int highscore;
    Information ob;
    Class1()
    {
        setLayout(new FlowLayout());
        setSize(250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B1 = new JButton("OK");
        B2 = new JButton("? Help");
        B3 = new JButton("High Score");
        L1 = new JLabel("Enter player name (no spaces):");
        T1 = new JTextField(20);
        T2 = new JTextField(20);
        R1 = new JRadioButton("Easy");
        R2 = new JRadioButton("Medium");
        R3 = new JRadioButton("Hard");
        ButtonGroup BG = new ButtonGroup();
        BG.add(R1);
        BG.add(R2);
        BG.add(R3);
        add(B2);
        add(B3);
        add(L1);
        add(T1);
        add(R1);
        add(R2);
        add(R3);
        add(B1);
        B1.addActionListener(this);
        B2.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae)
                {
                   help = new Help(); 
                }
        });
        B3.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae)
                {
                    int easy,medium,hard;
                    String ename,mname,hname;
                    ob = new Information();
                    String [] data = new String [6];
               try {
                   data = ob.retData();
               } catch (IOException ex) {
                   Logger.getLogger(Class1.class.getName()).log(Level.SEVERE, null, ex);
               }
               catch(Exception e)
                {
                    System.out.print(e.getStackTrace());
                }
               new Highscore(data[0],data[2],data[4],(Integer.parseInt(data[1])),(Integer.parseInt(data[3])), (Integer.parseInt(data[5])));
                }
        });
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String in = T1.getText();
        if((checkSpaces(in)) == 1)
            T1.setText("Please enter a valid name");
        else{
        if((in.equals("") || in.equals("Please enter a valid name")) || (!(R1.isSelected() || R2.isSelected() || R3.isSelected())) )
        {
            if(in.equals("") || in.equals("Please enter a valid name"))
                T1.setText("Please enter a valid name");
            if(!(R1.isSelected() || R2.isSelected() || R3.isSelected()))
            {
                add(T2);
                setVisible(true);
                T2.setText("Enter a difficulty");
            }
        }
        else
        {
            name = T1.getText();
            if(R1.isSelected())
                diff = R1.getText();
            else if(R2.isSelected())
                diff = R2.getText();
            else
                diff = R3.getText();
            
            T2.setText(diff);
            Class2 cl2 = new Class2(name,diff);
        }
        }
    }
    
    int checkSpaces(String str)
    {
        int len = str.length();
        int flag = 0,count = 0;
        char ch;
        for(int i=0; i<len; i++)
        {
            if(count >= 1)
            {
                flag = 1;
                break;
            }
            ch = str.charAt(i);
            if(ch == 32)
                count++;
        }
        return flag;
    }
}