package com.SwingConsole;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.util.concurrent.*;

public class SwingConsole{
  public static void run(final JFrame f,final int width,final int height){
    SwingUtilities.invokeLater(new Runnable(){
      public void run (){
        f.setTitle(f.getClass().getSimpleName());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(width,height);
        f.setVisible(true);
      }
    });
  }
}