package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JTextField tf;
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(l1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(700,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(750,150,300,25);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tf = new JTextField();
        tf.setBounds(700,200,250,25);
        tf.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tf);
        
        b1 = new JButton("Rules");
        b1.setBounds(700,250,100,20);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(850,250,100,20);
        b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        
         setSize(1000,400);
         setLocation(200,200);
        setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent event){
        
        if(event.getSource() == b1)
        {
            setVisible(false);
            String name = tf.getText();
            new Rules(name);
            
        }else if(event.getSource() == b2)
        {
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}
