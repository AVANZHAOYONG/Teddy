package org.jcoretechnology.com.core10.v2ch11.imageTransfer;

import java.awt.*;
import javax.swing.*;

/**
 * This program demonstrates the transfer of images between a Java application and the system
 * clipboard.
 * @version 1.22 2007-08-16
 * @author Cay Horstmann
 */
public class ImageTransferTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               JFrame frame = new ImageTransferFrame();
               frame.setTitle("ImageTransferTest");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

