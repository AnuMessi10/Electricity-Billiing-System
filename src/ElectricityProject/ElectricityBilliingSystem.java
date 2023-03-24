/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author anura
 */
public class ElectricityBilliingSystem
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
          
        fframe f1 = new fframe();
        
        f1.setVisible(true);
        
        int i;
        
        int x=1;
        
        for(i=2; i<=270; i+=4, x+=1)
        {
            f1.setLocation(800 - ((i+x)/2), 300 - (i/2));
            f1.setSize( 2*i ,i*2);
          
            try
            {
                Thread.sleep(5);
            }
            catch(InterruptedException e)
            {}
        } 
    }
}
class fframe extends JFrame implements Runnable
{
    Thread t1;
    fframe()
    {
        super("Electricity Billing System");
        
        setLayout(new FlowLayout());
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icon/xielogo.png"));
        
        Image i1 = c1.getImage().getScaledInstance(110, 80,Image.SCALE_DEFAULT);
        
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l1 = new JLabel(i2);
        
        
        ImageIcon c2 = new ImageIcon(ClassLoader.getSystemResource("icon/elec.jpg"));
        
        Image i3 = c2.getImage().getScaledInstance(1170/2, 550/2,Image.SCALE_DEFAULT);
        
        ImageIcon i4 = new ImageIcon(i3);
        
        JLabel l2 = new JLabel(i4);
        
        setLayout(new BorderLayout());
        
        JLabel xie = new JLabel("Electricity Billing Management System", SwingConstants.CENTER);
        xie.setFont(new Font("ubuntu", Font.BOLD, 24));
        
        xie.setForeground(Color.WHITE);
        
        add(l1, BorderLayout.NORTH);
        
        getContentPane().setBackground(Color.BLACK);
        
        add(xie, BorderLayout.CENTER);
        
        add(l2, BorderLayout.SOUTH);
        
        t1 = new Thread(this);
        
        t1.start();
    }
    public void run()
    {
        try
        {
            Thread.sleep(6000);
            
            this.setVisible(false);
            
            Login l = new Login();
            
            l.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}