package org.jcoretechnology.com.core10.v2ch11.transferText;

import java.awt.*;
import javax.swing.*;

/**
 * This program demonstrates the transfer of text between a Java application and the system
 * clipboard.
 * @version 1.13 2007-08-16
 * @author Cay Horstmann
 */
public class TextTransferTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               JFrame frame = new TextTransferFrame();
               frame.setTitle("TextTransferTest");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}