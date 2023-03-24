/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityProject;

/**
 *
 * @author anura
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener
{
    Project()
    {
        super("Electricity Billing System");
        
        setSize(1632, 1224);
        setLocation(144, 0);
        
        /* Adding background image */
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("icon/slider3.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1632, 965, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
       
        /* First Column */
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Customer");
        JMenuItem m1 = new JMenuItem("New Customer");
        JMenuItem m2 = new JMenuItem("Customer Details");
        //JMenuItem m3 = new JMenuItem("Deposit Details");
        master.setForeground(Color.BLUE);
        
        /* ---- Customer Details ---- */
        m1.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image1 = icon1.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('D');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        /* ---- Meter Details ---- */
        m2.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/user.png"));
        Image image2 = icon2.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('M');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        
        // --------------------------------------------------------------------------------------------
        
        /* Second Column */
        JMenu Billing = new JMenu("Billing");
        JMenuItem u1 = new JMenuItem("Pay Bill");
        JMenuItem u2 = new JMenuItem("Calculate Bill");
        JMenuItem u3 = new JMenuItem("Last Bill");
        Billing.setForeground(Color.black);
        
        /* ---- Pay Bill ---- */
        u1.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/invoice.png"));
        Image image4 = icon4.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        /* ---- Bill Details ---- */
        u2.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/accounting.png"));
        Image image5 = icon5.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('B');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        
        /* ---- Last Bill ----*/
        u3.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/clock.png"));
        Image image6 = icon6.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        u3.setIcon(new ImageIcon(image6));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);
        
        // --------------------------------------------------------------------------------------------- 
        
        /* Third Column*/
        JMenu report = new JMenu("Generate");
        JMenuItem r1 = new JMenuItem("Generate Bill");
        report.setForeground(Color.GREEN);
        
        /* ---- Report ---- */
        r1.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/receipt.png"));
        Image image7 = icon7.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        // -----------------------------------------------------------------------------------------------
        
        /* Fourth Column*/
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.ORANGE); 
        
        /* ---- Notepad ---- */
        ut1.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image image8 = icon8.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        
        /* ---- Calculator ---- */
        ut2.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image image9 = icon9.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
        
        /* ---- Web Browser ---- */
        ut3.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/chrome.png"));
        Image image10 = icon10.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);

        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        // ---------------------------------------------------------------------------------------
        
        /*Fifth Column */
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);
        
        /* ---- Exit ---- */
        ex.setFont(new Font("ubuntu",Font.TYPE1_FONT,12));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image image11 = icon11.getImage().getScaledInstance(48, 48,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
     
        // --------------------------------------------------------------------------------------------
        
        master.add(m1);
        master.add(m2);
        
        Billing.add(u1);
        Billing.add(u2);
        Billing.add(u3);
        
        report.add(r1);
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
        exit.add(ex);
         
        mb.add(master);
        mb.add(Billing);
        mb.add(report);
        mb.add(utility);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("ubuntu",Font.BOLD,18));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String msg = ae.getActionCommand();
        if(msg.equals("Customer Details"))
        {
            new customer_details().setVisible(true);            
        }
        else if(msg.equals("New Customer"))
        {
            new new_customer().setVisible(true);            
        }
        else if(msg.equals("Calculate Bill"))
        {
            new calculate_bill().setVisible(true);        
        }
        else if(msg.equals("Last Bill"))
        {
            new LastBill().setVisible(true);          
        }
        else if(msg.equals("Pay Bill"))
        {
            new pay_bill().setVisible(true);
        }
        else if(msg.equals("Notepad"))
        {
            try
            {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e)
            { 
            }
        }
        else if(msg.equals("Calculator"))
        {
            try
            {
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e)
            {
            }
        }
        else if(msg.equals("Web Browser"))
        {
            try
            {
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
            }
            catch(Exception e)
            { 
            }
        }else if(msg.equals("Exit"))
        {
            System.exit(0);
        }
        else if(msg.equals("Generate Bill"))
        {
            new generate_bill().setVisible(true);
        }
    }
    
    public static void main(String[] args)
    {
        new Project().setVisible(true);
    } 
}