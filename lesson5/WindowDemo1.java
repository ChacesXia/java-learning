package com.chaces1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.util.concurrent.*;

class WindowDemo1 extends JFrame{
  JLabel label;
  public WindowDemo1(){
    super("WINDOW DEMO1");
    label=new JLabel("this is a new Label!");
    setLayout(new BorderLayout());
    add(BorderLayout.NORTH,label);
    add(BorderLayout.CENTER,label);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,600);
    setVisible(true);
  }
  static WindowDemo1 wd1;
  public static void main (String[] args)throws Exception{
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        wd1= new WindowDemo1();
      }
    });

    TimeUnit.SECONDS.sleep(1);
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        wd1.label.setText("这是新的框架");
      }
    });

    // label1.setText("hey;It's Changed!");
  }
}