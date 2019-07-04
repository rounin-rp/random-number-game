
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Date - 02 July 2019
Author - rpetwal

*/

class Class2 extends JFrame implements ActionListener
{
    int highscore,number,chance = 7;
    JButton B;
    JTextField T1,T2,T3;
    JLabel L1,L2,L3,L4,L5,L6;
    String diff,name;
    Random rand = new Random();
    Information inf;
    Class2(String name,String diff)
    {
        this.diff = diff;
        this.name = name;
        highscore = 0;
        setLayout(new FlowLayout());
        setSize(300,300);
        B = new JButton("OK");
        T1 = new JTextField(3);
        T2 = new JTextField(8);
        T3 = new JTextField(1);
        L1 = new JLabel("Enter number : ");
        L1.setVerticalAlignment(SwingConstants.CENTER);
        L2 = new JLabel("<html></br>Result :</html>");
        L3 = new JLabel("<html><p1>"+this.diff+" mode <br/></p1></html>");
        L3.setHorizontalAlignment(SwingConstants.CENTER);
        L3.setVerticalAlignment(SwingConstants.TOP);
        L4 = new JLabel("Chances : ");
        T3.setText(chance+"");
        L5 = new JLabel("Your score :");
        add(L3);
        add(L4);
        add(T3);
        add(L1);
        add(T1);
        add(L2);
        add(T2);
        add(B);
        setVisible(true);
        if(diff.equals("Easy"))
           number = rand.nextInt(10);
        else if(diff.equals("Medium"))
            number = rand.nextInt(50);
        else
            number = rand.nextInt(100);
        B.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
                {
                       int ent_num,flag = 0;
                    String text = T1.getText();
                    ent_num = Integer.parseInt(text);
                    if(chance == 1)
                    {
                        T2.setText("Lose!");
                        highscore = 0;
                        L5 = new JLabel(highscore+"");
                        add(L5);
                        add(L6);
                        setVisible(true);
                        flag = 1;
                    }
                else{
                    if(ent_num == number){
                        T2.setText("Correct!");
                        highscore = chance * 100;
                        L6 = new JLabel(highscore+"");
                        add(L5);
                        add(L6);
                        setVisible(true);
                        flag = 1;
                    }
                    else if(ent_num > number)
                    {
                        T1.setText("");
                        T2.setText("Greater");
                        chance--;
                    }
                    else
                    {
                        T2.setText("Smaller");
                        T1.setText("");
                        chance--;
                    }   
                    }
                    T3.setText(chance+"");
                    inf = new Information(name,diff,highscore);
                    if(flag == 1)
                {
                    try {
                        inf.save_data();
                        } catch (IOException ex) {
                        Logger.getLogger(Class2.class.getName()).log(Level.SEVERE, null, ex);
                            }
                }
                }
        });
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
    
