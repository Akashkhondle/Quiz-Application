
package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score){
        setBounds(300,100,600,450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image l2 = l1.getImage().getScaledInstance(250,200,Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel image = new JLabel(l3);
        image.setBounds(0,150,200,200);
        add(image);
        
        
        JLabel hd =new JLabel("Thank You " + name + " For playing simple minds");
        hd.setBounds(40,20,550,30);
        hd.setFont(new Font("Tohma",Font.PLAIN,26));
        add(hd);
        
        JLabel ls =new JLabel("Your Score is " + score);
        ls.setBounds(250,150,250,30);
        ls.setFont(new Font("Tohma",Font.PLAIN,26));
        add(ls);
        
         JButton submit = new JButton("Play Again");
        submit.setBounds(300,200,100,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);   
        add(submit);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event){
        setVisible(false);
        new Login();
         
    }
    public static void main(String[] args){
        new Score("User",0);
    }
    
}
