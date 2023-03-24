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
import java.sql.*;

public class generate_bill extends JFrame implements ActionListener
{
    JLabel l1;
    JTextArea t1;
    JButton b1;
    Choice c1,c2;
    JPanel p1;
    generate_bill()
    {
        setSize(500,900);
        setLayout(new BorderLayout());
        
        p1 = new JPanel();
        
        l1 = new JLabel("Generate Bill");
        
        c1 = new Choice();
        c2 = new Choice();
        
        try
        {
            conn test = new conn();
                        
            String s = "select meter_number from  customer";
            
            ResultSet rs;
            
            rs = test.s.executeQuery(s);
            
            while(rs.next())
            {
                c1.add(rs.getString("meter_number"));
            }
        }
        catch(Exception aee)
        {
            aee.printStackTrace();
        }        
        
        c2.add("January");
        c2.add("February");
        c2.add("March");
        c2.add("April");
        c2.add("May");
        c2.add("June");
        c2.add("July");
        c2.add("August");
        c2.add("September");
        c2.add("October");
        c2.add("November");
        c2.add("December");
        
        t1 = new JTextArea(50,15);
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("Senserif",Font.ITALIC,18));
        
        b1 = new JButton("Generate Bill");
        
        p1.add(l1);
        p1.add(c1);
        p1.add(c2);
        add(p1,"North");
        
        add(jsp,"Center");
        add(b1,"South");
        
        b1.addActionListener(this);
        
        setLocation(350,40);
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            conn c = new conn();
   
            String mo = c2.getSelectedItem();
            t1.setText("\tXavier Power Limited\nElectricity Bill Generated For The Month Of " + mo + " ,2020\n\n\n");
            
            ResultSet rs = c.s.executeQuery("select * from customer where meter_number = " + c1.getSelectedItem());
            
            if(rs.next())
            {
                t1.append("\n    Customer Name:"+rs.getString("name"));
                t1.append("\n    Meter Number:  "+rs.getString("meter_number"));
                t1.append("\n    Address:            "+rs.getString("address"));
                t1.append("\n    State:                 "+rs.getString("state"));
                t1.append("\n    City:                   "+rs.getString("city"));
                t1.append("\n    Email:                "+rs.getString("email"));
                t1.append("\n    Phone Number  "+rs.getString("phone"));
                t1.append("\n-------------------------------------------------------------");
                t1.append("\n");
            }
            
            rs = c.s.executeQuery("select * from tax");
            
            if(rs.next())
            {
                t1.append("\n    Meter Location:"+rs.getString("meter_location"));
                t1.append("\n    Meter Type:      "+rs.getString("meter_type"));
                t1.append("\n    Phase Code:    "+rs.getString("phase_code"));
                t1.append("\n    Bill Type:         "+rs.getString("bill_type"));
                t1.append("\n    Days:               "+rs.getString("days"));
                t1.append("\n");
                t1.append("---------------------------------------------------------------");
                t1.append("\n\n");
                t1.append("\n    Meter Rent:\t\t"+rs.getString("meter_rent"));
                t1.append("\n    MCB Rent:  \t\t"+rs.getString("mcb_rent"));
                t1.append("\n    Service Tax:\t"+rs.getString("service_rent"));
                t1.append("\n    GST@9%:\t\t"+rs.getString("gst"));
                t1.append("\n");                
            }
            
            String a1 = c1.getSelectedItem();
            String a2 = c2.getSelectedItem();
           
            rs = c.s.executeQuery("select * from bill where meter_number = " + a1 + " and month = '" + a2 + "'");
            if(rs.next())
            {
                t1.append("\n    Meter Number:\t"+rs.getString("meter_number"));
                t1.append("\n    Current Month :\t"+rs.getString("month"));
                t1.append("\n    Units Consumed:\t"+rs.getString("units"));
                t1.append("\n    Total Charges :\t"+rs.getString("amount"));
                t1.append("\n---------------------------------------------------------------");
                t1.append("\n    Net Payable :\t"+rs.getString("amount"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        new generate_bill().setVisible(true);
    }
}


