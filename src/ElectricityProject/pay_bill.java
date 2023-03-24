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
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.*;

public class pay_bill extends JFrame
{    
    pay_bill()
    {
        try 
        {
            Desktop.getDesktop().browse(new URL("https://www.ccavenue.com/").toURI());
        }
        catch (IOException | URISyntaxException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        pay_bill obj = new pay_bill();
    }
}
