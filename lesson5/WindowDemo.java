// 1.创建一个窗口，两个面板，并创建你所了解的其他组件，将组件放到面板，将面板放到窗口，选择适当的布局管理器。
package com.chaces;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.util.concurrent.*;

class WindowDemo extends JFrame{
  JFrame frame;
  public WindowDemo(){

  }
  // 注意要抛出异常
  public static void main (String[] args)throws Exception{
    WindowDemo wd=new WindowDemo();
  // 创建jframe和jlabel
    JFrame frame1=new JFrame("Jframe Window");
    JLabel label1=new JLabel("label1");
  // 添加jlabel到jframe中
    frame1.add(label1);
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(300,300);
    frame1.setVisible(true);

    TimeUnit.SECONDS.sleep(1);

    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        label1.setText("这是在invoke中的设置效果");
      }
    });

    // label1.setText("hey;It's Changed!");
  }
}